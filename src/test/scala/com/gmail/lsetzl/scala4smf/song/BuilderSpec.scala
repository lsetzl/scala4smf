package com.gmail.lsetzl.scala4smf.song

import com.gmail.lsetzl.scala4smf.SmfAssertions
import org.scalatest.{DiagrammedAssertions, FlatSpec}

class BuilderSpec extends FlatSpec with DiagrammedAssertions with SmfAssertions {
  "write" should "generate standard midi file" in {
    Builder().write("test.mid")
    isSmf("test.mid")
  }
}
