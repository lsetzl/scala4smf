package com.gmail.lsetzl.scala4smf.command

import com.gmail.lsetzl.scala4smf.unit.MidiEvent
import javax.sound.midi.MidiMessage

trait HasSingleMessage extends HasMidiEvents {
  protected def message(value: Int): MidiMessage

  override def midiEvents: Seq[MidiEvent] = {
    if (tickRange.isSingle) {
      List(MidiEvent(message(valueRange.start.value), tickRange.start))
    } else {
      valueRange.map { v =>
        val t = tickRange.at(valueRange.rate(v))
        MidiEvent(message(v.value), t)
      }
    }
  }
}
