package chapter8.music;

import chapter0.PrintUtils;

class Instrument {

  public void play(Note n) {
    PrintUtils.print("Instrument.play()");
  }
}

public class Wind extends Instrument {

  public void play(Note n) {
    PrintUtils.print("Wind.play() " + n);
  }
}
