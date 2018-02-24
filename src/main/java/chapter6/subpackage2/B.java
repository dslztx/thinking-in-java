package chapter6.subpackage2;

import chapter6.subpackage1.A;

public class B extends A {

  //类B的完整定义
  //int c;

  public void f() {
    //加上注释语句，编译出错
    //System.out.println(a);

    System.out.println(c);
  }

}
