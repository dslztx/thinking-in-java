package chapter8.music3;

import chapter0.PrintUtils;
import chapter8.music.Note;

public class Wind extends Instrument {

  @Override
  void play(Note n) {
    PrintUtils.print("Wind.play() " + n);
  }

  @Override
  String what() {
    return "Wind";
  }

  @Override
  void adjust() {
    PrintUtils.print("Adjusting Wind");
  }
}
