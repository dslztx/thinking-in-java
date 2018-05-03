package chapter9.music5;

import chapter0.PrintUtils;
import chapter8.music.Note;

interface Instrument {

  int VALUE = 5;

  void play(Note n);

  void adjust();
}

class Wind implements Instrument {

  public void play(Note n) {
    PrintUtils.print(this + ".play() " + n);
  }

  public String toString() {
    return "Wind";
  }

  public void adjust() {
    PrintUtils.print(this + ".adjust()");
  }
}

class Percussion implements Instrument {

  public void play(Note n) {
    PrintUtils.print(this + ".play() " + n);
  }

  public void adjust() {
    PrintUtils.print(this + ".adjust()");
  }

  public String toString() {
    return "Stringed";
  }
}

class Stringed implements Instrument {

  public void play(Note n) {
    PrintUtils.print(this + ".play()" + n);
  }

  public String toString() {
    return "Stringed";
  }

  public void adjust() {
    PrintUtils.print(this + ".adjust()");
  }
}

class Brass extends Wind {

  public String toString() {
    return "Brass";
  }
}

class Woodwind extends Wind {

  public String toString() {
    return "Woodwind";
  }
}

public class Music5 {

  static void tune(Instrument i) {
    i.play(Note.MIDDLE_C);
  }

  static void tuneAll(Instrument[] e) {
    for (Instrument i : e) {
      tune(i);
    }
  }

  public static void main(String[] args) {
    Instrument[] orchestra = {new Wind(), new Percussion(), new Stringed(), new Brass(),
        new Woodwind()};
    tuneAll(orchestra);
  }
}
