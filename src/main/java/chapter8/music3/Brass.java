package chapter8.music3;

import chapter0.PrintUtils;
import chapter8.music.Note;

public class Brass extends Wind {

  @Override
  void play(Note n) {
    PrintUtils.print("Brass.play() " + n);
  }

  @Override
  void adjust() {
    PrintUtils.print("Adjusting Brass");
  }
}
