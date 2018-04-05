package chapter8;

interface A5 {

  int a = 40;
}

public class Polymorphic3 extends A4 implements A5 {

  public static void main(String[] args) {
    Polymorphic3 polymorphic3 = new Polymorphic3();
    //Ã· æ£∫ Reference to 'a' is ambiguous, both 'A4.a' and 'A5.a' match
//    System.out.println(polymorphic3.a);
  }
}

class A4 {

  int a = 10;
}