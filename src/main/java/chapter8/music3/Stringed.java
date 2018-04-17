package chapter8.music3;

import chapter0.PrintUtils;
import chapter8.music.Note;

public class Stringed extends Instrument {

  @Override
  void play(Note n) {
    PrintUtils.print("Stringed.play() " + n);
  }

  @Override
  String what() {
    return "Stringed";
  }

  @Override
  void adjust() {
    PrintUtils.print("Adjusting Stringed");
  }
}
