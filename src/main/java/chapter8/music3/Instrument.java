package chapter8.music3;

import chapter0.PrintUtils;
import chapter8.music.Note;

public class Instrument {

  void play(Note n) {
    PrintUtils.print("Instrument.play() " + n);
  }

  String what() {
    return "Instrument";
  }

  void adjust() {
    PrintUtils.print("Adjusting Instrument");
  }

}
