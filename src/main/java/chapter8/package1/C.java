package chapter8.package1;

import chapter8.package2.B;

public class C {

  public static void print(A a) {
    a.f();
  }

  public static void main(String[] args) {
    B b = new B();
    //����ֱ�ӷ��ʸ÷���
    //b.f();

    //ͨ����̬�����˱����ܷ��ʵķ���
    print(b);
  }
}
