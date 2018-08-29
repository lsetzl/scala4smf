package com.gmail.lsetzl.scala4smf.command.song

import com.gmail.lsetzl.scala4smf.unit.{CommandValueRange, TickRange}

case class MasterVolume(override val valueRange: CommandValueRange, override val tickRange: TickRange) extends SystemExclusive {
  override val isRealTime: Boolean = true
  override val subId1: Int = 0x04
  override val subId2: Int = 0x01
  override def data(value: Int): Seq[Int] = List(0x00, value)
}
