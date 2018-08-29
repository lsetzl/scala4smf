package com.gmail.lsetzl.scala4smf.unit

case class CommandValue(value: Int) extends AnyVal with Ordered[CommandValue] {
  def +(a: CommandValue): CommandValue = CommandValue(value + a.value)

  def -(a: CommandValue): CommandValue = CommandValue(value - a.value)

  def *(a: Double): CommandValue = CommandValue((value * a).toInt)

  def /(a: CommandValue): Double = value.toDouble / a.value

  def /(a: Double): CommandValue = CommandValue((value / a).toInt)

  override def compare(that: CommandValue): Int = (this - that).value
}

