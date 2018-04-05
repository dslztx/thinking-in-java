package chapter8;

public class Polymorphic1 extends A1 {

  int a = 20;

  public static void main(String[] args) {
    A1 a1 = new Polymorphic1();
    //½á¹ûÎª10
    System.out.println(a1.a);
  }
}

class A1 {

  int a = 10;
}