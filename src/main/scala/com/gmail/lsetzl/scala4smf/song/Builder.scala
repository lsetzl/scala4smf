package com.gmail.lsetzl.scala4smf.song

import java.io.File

import javax.sound.midi.{MidiSystem, Sequence}

case class Builder() {
  def write(path: String): Unit = {
    val sequence = new Sequence(Sequence.PPQ, 48)
    val track = sequence.createTrack()
    val t = MidiSystem.getMidiFileTypes(sequence)
    MidiSystem.write(sequence, 1, new File(path))
  }
}
