package chapter8;

public class Polymorphic2 extends A3 {

  public static void main(String[] args) {
    Polymorphic2 polymorphic2 = new Polymorphic2();
    //½á¹ûÎª30
    System.out.println(polymorphic2.a);
  }
}

class A2 {

  int a = 10;
}

class A3 extends A2 {

  int a = 30;
}