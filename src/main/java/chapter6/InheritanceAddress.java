package chapter6;

class A {

  int a;

  void f() {
    System.out.println("hello");
  }

}

class B extends A {

  int b;

  void g() {
    System.out.println("world");
  }

}

public class InheritanceAddress {

  public static void main(String[] args) {
    B bInstance = new B();

    //��a��Ϊ����Դ������Դ�����ַΪ��chapter6.B������ָ�����������Ӳ��Դ�ĵ�ַΪ��chapter6.A��
    System.out.println(bInstance.a);
    //��f()��Ϊ����Դ������Դ�����ַΪ��chapter6.B������ָ�����������Ӳ��Դ�ĵ�ַΪ��chapter6.A��
    bInstance.f();

    //��b��ΪӲ��Դ��Ӳ��Դ�����ַΪ��chapter6.B��
    System.out.println(bInstance.b);
    //��g()��ΪӲ��Դ��Ӳ��Դ�����ַΪ��chapter6.B��
    bInstance.g();
  }

}
