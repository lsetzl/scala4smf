package com.gmail.lsetzl.scala4smf.unit

import javax.sound.midi.MidiMessage

case class MidiEvent(midiMessage: MidiMessage, tick: Tick) {
  def toJava: javax.sound.midi.MidiEvent = new javax.sound.midi.MidiEvent(MidiMessage, tick.value)
}
