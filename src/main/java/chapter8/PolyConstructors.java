package chapter8;

import chapter0.PrintUtils;

class Glyph {

  Glyph() {
    PrintUtils.print("Glyph() before draw()");
    draw();
    PrintUtils.print("Glyph() after draw()");
  }

  void draw() {
    PrintUtils.print("Glyph.draw()");
  }
}

class RoundGlyph extends Glyph {

  private int radius = 1;

  RoundGlyph(int r) {
    radius = r;
    PrintUtils.print("RoundGlyph.RoundGlyph(), radius = " + radius);
  }

  void draw() {
    PrintUtils.print("RoundGlyph.draw(), radius = " + radius);
  }
}

public class PolyConstructors {

  public static void main(String[] args) {
    new RoundGlyph(5);
  }

}
