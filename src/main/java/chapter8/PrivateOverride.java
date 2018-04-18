package chapter8;

import chapter0.PrintUtils;

public class PrivateOverride {

  public static void main(String[] args) {
    PrivateOverride po = new Derived();
    po.f();
  }

  private void f() {
    PrintUtils.print("private f()");
  }

}

class Derived extends PrivateOverride {

  public void f() {
    PrintUtils.print("public f()");
  }
}
