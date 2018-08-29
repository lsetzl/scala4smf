package com.gmail.lsetzl.scala4smf.command.song

import com.gmail.lsetzl.scala4smf.command.HasSingleMessage
import javax.sound.midi.{MidiMessage, SysexMessage}

trait SystemExclusive extends SongCommand with HasSingleMessage {
  val isRealTime: Boolean
  val subId1: Int
  val subId2: Int

  def data(value: Int): Seq[Int]

  override protected def message(value: Int): MidiMessage = {
    val second: Int = if (isRealTime) 0x7f else 0x7e
    val d = (List(0xf0, second, subId1, subId2) ++ data(value) ++ List(0xf7)).map(_.toByte).toArray
    new SysexMessage(d, d.length)
  }
}
