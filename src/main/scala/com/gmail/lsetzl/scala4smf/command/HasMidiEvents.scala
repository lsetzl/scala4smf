package com.gmail.lsetzl.scala4smf.command

import com.gmail.lsetzl.scala4smf.unit.MidiEvent

trait HasMidiEvents extends Command {
  def midiEvents: Seq[MidiEvent]
}
