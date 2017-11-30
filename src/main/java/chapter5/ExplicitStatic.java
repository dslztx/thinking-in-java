package chapter5;

import chapter0.PrintUtils;

class Cup {

  Cup(int marker) {
    PrintUtils.print("Cup(" + marker + ")");
  }

  void f(int marker) {
    PrintUtils.print("f(" + marker + ")");
  }
}

class Cups {

  static Cup cup1;
  static Cup cup2;

  static {
    cup1 = new Cup(1);
    cup2 = new Cup(2);
  }

  Cups() {
    PrintUtils.print("Cups()");
  }
}

public class ExplicitStatic {

  public static void main(String[] args) {
    PrintUtils.print("Inside main()");
    Cups.cup1.f(99);
  }
}
