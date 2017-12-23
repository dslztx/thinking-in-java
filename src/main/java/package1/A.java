package package1;

import package3.AAA;

/**
 * 父类
 *
 * @author dsl
 */
public class A {

  public int d;
  protected int c;
  int b;
  private int a;

  void f() {
    AAA aaa = new AAA();
    System.out.println(aaa.a);
    System.out.println(aaa.b);
    System.out.println(aaa.c);
    System.out.println(aaa.d);

    AA4 aa4 = new AA4();
    System.out.println(aa4.a);
    System.out.println(aa4.b);
    System.out.println(aa4.c);
    System.out.println(aa4.d);
  }

}