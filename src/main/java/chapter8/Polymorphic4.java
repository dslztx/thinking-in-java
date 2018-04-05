package chapter8;

public class Polymorphic4 extends A6 {

  public static void main(String[] args) {
    Polymorphic4 polymorphic4 = new Polymorphic4();
    //½á¹ûÎª20
    System.out.println(polymorphic4.f());
  }

  int f() {
    return 20;
  }
}

abstract class A6 {

  abstract int f();
}