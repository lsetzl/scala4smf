package com.gmail.lsetzl.scala4smf.song

import java.io.File

import com.gmail.lsetzl.scala4smf.command.Command
import javax.sound.midi.{MidiSystem, Sequence}

case class Builder(commands: Seq[Command]) {
  def add(a: Command): Builder = copy(commands = commands :+ a)

  def write(path: String): Unit = {
    val sequence = new Sequence(Sequence.PPQ, 48)
    sequence.createTrack()
    MidiSystem.write(sequence, 1, new File(path))
  }
}

object Builder {
  def apply(): Builder = Builder(Nil)
}