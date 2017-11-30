package chapter5;

import chapter0.PrintUtils;

class Window {

  Window(int marker) {
    PrintUtils.print("Window(" + marker + ")");
  }
}

class House {

  Window w1 = new Window(1);
  House()
  {
    PrintUtils.print("House()");
    w3 = new Window(33);
  }

  Window w2 = new Window(2);
  void f()
  {
    PrintUtils.print("f()");
  }

  Window w3 = new Window(3);
}

public class OrderOfInitialization {

  public static void main(String[] args) {
    House h = new House();
    h.f();
  }
}
