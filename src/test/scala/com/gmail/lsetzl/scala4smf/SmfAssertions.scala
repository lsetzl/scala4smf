package com.gmail.lsetzl.scala4smf

import java.io.File

import javax.sound.midi.MidiSystem
import org.scalatest.Assertions

trait SmfAssertions extends Assertions {
  def isSmf(path: String): Boolean = {
    MidiSystem.getSequence(new File(path))
    true
  }
}
