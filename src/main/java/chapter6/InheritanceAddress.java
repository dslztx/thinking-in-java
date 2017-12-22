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

    //“a”为软资源。软资源自身地址为“chapter6.B”；所指向的祖先类中硬资源的地址为“chapter6.A”
    System.out.println(bInstance.a);
    //“f()”为软资源。软资源自身地址为“chapter6.B”；所指向的祖先类中硬资源的地址为“chapter6.A”
    bInstance.f();

    //“b”为硬资源。硬资源自身地址为“chapter6.B”
    System.out.println(bInstance.b);
    //“g()”为硬资源。硬资源自身地址为“chapter6.B”
    bInstance.g();
  }

}
