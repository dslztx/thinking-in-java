package chapter7;

import chapter0.PrintUtils;

class Insect {

  private static int x1 = printInit("static Insect.x1 initialized");
  protected int j;
  private int i = 9;

  Insect() {
    PrintUtils.print("i = " + i + ", j = " + j);
    j = 39;
  }

  static int printInit(String s) {
    PrintUtils.print(s);
    return 47;
  }
}

public class Beetle extends Insect {

  private static int x2 = printInit("static Beetle.x2 initialized");
  private int k = printInit("Beetle.k initialized");

  public Beetle() {
    PrintUtils.print("k = " + k);
    PrintUtils.print("j = " + j);
  }

  public static void main(String[] args) {
    PrintUtils.print("Beetle constructor");
    Beetle b = new Beetle();
  }
}
