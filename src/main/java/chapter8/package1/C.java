package chapter8.package1;

import chapter8.package2.B;

public class C {

  public static void print(A a) {
    a.f();
  }

  public static void main(String[] args) {
    B b = new B();
    //不能直接访问该方法
    //b.f();

    //通过多态访问了本不能访问的方法
    print(b);
  }
}
