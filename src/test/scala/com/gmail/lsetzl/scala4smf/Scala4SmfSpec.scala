package com.gmail.lsetzl.scala4smf

import com.gmail.lsetzl.scala4smf.song.{Builder, ForSong}
import org.scalatest.{DiagrammedAssertions, FlatSpec}

class Scala4SmfSpec extends FlatSpec with DiagrammedAssertions {
  "build" should "returns ForSong instance" in {
    assert(Scala4Smf.build == ForSong(Builder()))
  }
}