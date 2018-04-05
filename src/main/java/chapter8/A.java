package chapter8;

public class A {

  static int b = 20;

  int a = 10;

  static int g() {
    return 40;
  }

  int f() {
    return 30;
  }

  public static void main(String[] args) {
    System.out.println(A.b);
    System.out.println(A.g());
  }
}
