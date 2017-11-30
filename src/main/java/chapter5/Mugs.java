package chapter5;

import chapter0.PrintUtils;

class Mug {

  Mug(int marker) {
    PrintUtils.print("Mug(" + marker + ")");
  }

  void f(int marker) {
    PrintUtils.print("f(" + marker + ")");
  }
}

public class Mugs {

  Mug mug1;
  Mug mug2;

  {
    mug1 = new Mug(1);
    mug2 = new Mug(2);
    PrintUtils.print("mug1 & mug2 initialized");
  }

  Mugs() {
    PrintUtils.print("Mugs()");
  }

  Mugs(int i) {
    PrintUtils.print("Mugs(int)");
  }

  public static void main(String[] args) {
    PrintUtils.print("Inside main()");
    new Mugs();
    PrintUtils.print("new Mugs() completed");
    new Mugs(1);
    PrintUtils.print("new Mugs(1) completed");
  }

}
