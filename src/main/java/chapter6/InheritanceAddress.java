package chapter6;

class A {

  int a;

  void f() {
    System.out.println("hello");
  }

}

class B extends A {

  int b;

  void g() {
    System.out.println("world");
  }

}

public class InheritanceAddress {

  public static void main(String[] args) {
    B bInstance = new B();

    //“a”这个Java资源的地址不为“chapter6.B”，而为“chapter6.A”
    System.out.println(bInstance.a);
    //“f()”这个Java资源的地址不为“chapter6.B”，而为“chapter6.A”
    bInstance.f();

    //“b”这个Java资源的地址为“chapter6.B”
    System.out.println(bInstance.b);
    //“g()”这个Java资源的地址为“chapter6.B”
    bInstance.g();
  }

}
