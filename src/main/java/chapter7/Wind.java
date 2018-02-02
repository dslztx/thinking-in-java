package chapter7;

class Instrument {

  static void tune(Instrument i) {
    i.play();
  }

  public void play() {

  }
}

public class Wind extends Instrument {

  public static void main(String[] args) {
    Wind flute = new Wind();
    Instrument.tune(flute);
  }
}
