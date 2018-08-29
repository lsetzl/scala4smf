package com.gmail.lsetzl.scala4smf.unit

case class Tick(value: Int) extends AnyVal with Ordered[Tick] {
  def +(a: Tick): Tick = Tick(value + a.value)

  def -(a: Tick): Tick = Tick(value - a.value)

  def *(a: Double): Tick = Tick((value * a).toInt)

  def /(a: Tick): Double = value.toDouble / a.value

  def /(a: Double): Tick = Tick((value / a).toInt)

  override def compare(that: Tick): Int = (this - that).value
}

object Tick {
  val Zero: Tick = Tick(0)
  val Max: Tick = Tick(Int.MaxValue)
}