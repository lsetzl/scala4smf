package com.gmail.lsetzl.scala4smf.unit

import scala.collection.immutable.NumericRange

case class TickRange(override val start: Tick, override val end: Tick,
                     override val step: Tick) extends NumericRange[Tick](start, end, step, false) {
  override def copy(start: Tick, end: Tick, step: Tick): NumericRange[Tick] = TickRange(start, end, step)

  def isSingle: Boolean = start == end

  def at(rate: Double): Tick = start + (end - start) * rate
}

object TickRange {
  def apply(start: Tick, end: Tick): TickRange = TickRange(start, end, Tick(1))

  val ALL: TickRange = TickRange(Tick.Zero, Tick.Max)
}