package com.gmail.lsetzl.scala4smf.unit

import scala.collection.immutable.NumericRange

case class CommandValueRange(override val start: CommandValue, override val end: CommandValue,
                             override val step: CommandValue) extends NumericRange[CommandValue](start, end, step, true) {
  override def copy(start: CommandValue, end: CommandValue, step: CommandValue): NumericRange[CommandValue] = {
    CommandValueRange(start, end, step)
  }

  def rate(value: CommandValue): Double = (value - start) / (end - start)
}

object CommandValueRange {
  def apply(start: CommandValue, end: CommandValue): CommandValueRange = CommandValueRange(start, end, CommandValue(1))
}