package com.dslztx.package3;

import com.dslztx.package2.F;

public class E {

  public static void main(String[] args) {
    E e = new F();
    e.f();
    e.g();
  }

  private void f() {
    System.out.println("Hello");
  }

  void g() {
    System.out.println("Hello");
  }
}