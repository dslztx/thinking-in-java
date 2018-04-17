package chapter8.music;

import chapter0.PrintUtils;

class Stringed extends Instrument {

  public void play(Note n) {
    PrintUtils.print("Stringed.play() " + n);
  }
}

class Brass extends Instrument {

  public void play(Note n) {
    PrintUtils.print("Brass.play() " + n);
  }
}

public class Music2 {

  public static void tune(Wind i) {
    i.play(Note.MIDDLE_C);
  }

  public static void tune(Stringed i) {
    i.play(Note.MIDDLE_C);
  }

  public static void tune(Brass i) {
    i.play(Note.MIDDLE_C);
  }

  public static void main(String[] args) {
    Wind flute = new Wind();
    Stringed violin = new Stringed();
    Brass frenchHorn = new Brass();
    tune(flute);
    tune(violin);
    tune(frenchHorn);
  }
}
