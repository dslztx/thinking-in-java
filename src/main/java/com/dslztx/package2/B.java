package com.dslztx.package2;

import com.dslztx.package1.A;

public class B extends A {

  private int a = 50;

  public static void main(String[] args) {
    B b = new B();

    //ǰ�ڰ󶨣��󶨵�B.a����ӡ50
    System.out.println(b.a);

    A a = new B();

    //ǰ�ڰ󶨣��󶨵�A.a����ӡ100
    System.out.println(a.a);

    C c = new C();

    //ǰ�ڰ󶨣���C.b����ӡ60
    System.out.println(c.b);

    A aa = new C();

    //ǰ�ڰ󶨣���A.a����ӡ100
    System.out.println(aa.a);
  }
}

class C extends A {

  int b = 60;
  private int a = 60;
}