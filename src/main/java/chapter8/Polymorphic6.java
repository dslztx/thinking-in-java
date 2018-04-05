package chapter8;

interface A9 {

  int f();
}

public class Polymorphic6 extends A10 {

  public static void main(String[] args) {
    Polymorphic6 polymorphic6 = new Polymorphic6();
    //½á¹ûÎª30
    System.out.println(polymorphic6.f());
  }
}

class A10 implements A9 {

  public int f() {
    return 30;
  }
}