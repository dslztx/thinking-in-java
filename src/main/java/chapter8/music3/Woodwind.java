package chapter8.music3;

import chapter0.PrintUtils;
import chapter8.music.Note;

public class Woodwind extends Wind {

  @Override
  void play(Note n) {
    PrintUtils.print("Woodwind.play() " + n);
  }

  @Override
  String what() {
    return "Woodwind";
  }
}
