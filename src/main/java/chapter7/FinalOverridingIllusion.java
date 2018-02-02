package chapter7;

import chapter0.PrintUtils;

class WithFinals {

  private final void f() {
    PrintUtils.print("WithFinals.f()");
  }

  private void g() {
    PrintUtils.print("WithFinals.g(");
  }
}

class OverridingPrivate extends WithFinals {

  private final void f() {
    PrintUtils.print("OverridingPrivate.f()");
  }

  private void g() {
    PrintUtils.print("OverridingPrivate.g()");
  }
}

class OverridingPrivate2 extends OverridingPrivate {

  public final void f() {
    PrintUtils.print("OverridingPrivate2.f()");
  }

  public void g() {
    PrintUtils.print("OverridingPrivate2.g()");
  }
}

public class FinalOverridingIllusion {

  public static void main(String[] args) {
    OverridingPrivate2 op2 = new OverridingPrivate2();
    op2.f();
    op2.g();

    OverridingPrivate op = op2;
    WithFinals wf = op2;
  }
}
