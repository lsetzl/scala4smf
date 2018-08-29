package com.gmail.lsetzl.scala4smf.song

import com.gmail.lsetzl.scala4smf.command.Command
import com.gmail.lsetzl.scala4smf.command.song.MasterVolume
import com.gmail.lsetzl.scala4smf.unit.{CommandValueRange, TickRange}

case class ForSong(builder: Builder, tickRange: TickRange) {
  protected def add(a: Command): ForSong = copy(builder = builder.add(a))

  def masterVolume(a: CommandValueRange): ForSong = add(MasterVolume(a, tickRange))

  def write(path: String): Unit = builder.write(path)
}

object ForSong {
  def apply(builder: Builder): ForSong = new ForSong(builder, TickRange.ALL)
}