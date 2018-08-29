package com.gmail.lsetzl.scala4smf.song

import com.gmail.lsetzl.scala4smf.SmfAssertions
import org.scalatest.{DiagrammedAssertions, FlatSpec}

class ForSongSpec extends FlatSpec with DiagrammedAssertions with SmfAssertions {
  "write" should "generate standard midi file" in {
    ForSong(Builder()).write("test.mid")
    assert(isSmf("test.mid"))
  }
}
