package com.gmail.lsetzl.scala4smf

import com.gmail.lsetzl.scala4smf.song.{Builder, ForSong}

object Scala4Smf {
  def build: ForSong = ForSong(Builder())
}
