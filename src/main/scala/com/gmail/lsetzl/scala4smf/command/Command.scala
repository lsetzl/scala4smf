package com.gmail.lsetzl.scala4smf.command

import com.gmail.lsetzl.scala4smf.unit.{CommandValueRange, TickRange}

trait Command {
  val tickRange: TickRange
  val valueRange: CommandValueRange
}
