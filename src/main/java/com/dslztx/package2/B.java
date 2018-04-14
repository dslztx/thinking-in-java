package com.dslztx.package2;

import com.dslztx.package1.A;

public class B extends A {

  private int a = 50;

  public static void main(String[] args) {
    B b = new B();

    //前期绑定：绑定到B.a，打印50
    System.out.println(b.a);

    A a = new B();

    //前期绑定：绑定到A.a，打印100
    System.out.println(a.a);

    C c = new C();

    //前期绑定：绑定C.b，打印60
    System.out.println(c.b);

    A aa = new C();

    //前期绑定：绑定A.a，打印100
    System.out.println(aa.a);
  }
}

class C extends A {

  int b = 60;
  private int a = 60;
}