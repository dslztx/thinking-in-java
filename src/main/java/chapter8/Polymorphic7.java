package chapter8;

interface A12 {

  int f();
}

public class Polymorphic7 extends A11 implements A12 {

  public static void main(String[] args) {
    Polymorphic7 polymorphic7 = new Polymorphic7();
    //½á¹ûÎª30
    System.out.println(polymorphic7.f());
  }
}

class A11 {

  public int f() {
    return 30;
  }
}