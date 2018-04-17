package chapter8.music3;

import chapter0.PrintUtils;
import chapter8.music.Note;

public class Percussion extends Instrument {

  @Override
  void play(Note n) {
    PrintUtils.print("Percussion.play() " + n);
  }

  @Override
  String what() {
    return "Percussion";
  }

  @Override
  void adjust() {
    PrintUtils.print("Adjusting Percussion");
  }
}
