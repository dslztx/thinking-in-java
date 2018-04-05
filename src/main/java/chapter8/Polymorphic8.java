package chapter8;

public class Polymorphic8 {

  public static void main(String[] args) {
    Polymorphic8 polymorphic8 = new A13();
    //结果为40
    System.out.println(polymorphic8.f());
    //结果为30
    A13 a13 = new A13();
    System.out.println(a13.f());
  }

  private int f() {
    return 40;
  }
}

class A13 extends Polymorphic8 {

  /**
   * 未继承覆盖Polymorphic8中的“int f()”方法，因此关于该一般方法无后期绑定
   */
  int f() {
    return 30;
  }
}