package chapter8;

public class Polymorphic5 extends A8 {

  public static void main(String[] args) {
    A7 a7 = new Polymorphic5();
    //½á¹ûÎª30
    System.out.println(a7.f());
  }

  int f() {
    return 30;
  }
}

class A7 {

  int f() {
    return 10;
  }
}

class A8 extends A7 {

  int f() {
    return 20;
  }
}