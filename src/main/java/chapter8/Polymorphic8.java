package chapter8;

public class Polymorphic8 {

  public static void main(String[] args) {
    Polymorphic8 polymorphic8 = new A13();
    //���Ϊ40
    System.out.println(polymorphic8.f());
    //���Ϊ30
    A13 a13 = new A13();
    System.out.println(a13.f());
  }

  private int f() {
    return 40;
  }
}

class A13 extends Polymorphic8 {

  /**
   * δ�̳и���Polymorphic8�еġ�int f()����������˹��ڸ�һ�㷽���޺��ڰ�
   */
  int f() {
    return 30;
  }
}