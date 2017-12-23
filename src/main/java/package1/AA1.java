package package1;

import package3.AAA;

/**
 * 同包子类（注释掉的资源表示不能被访问）
 *
 * @author dsl
 */
public class AA1 extends A {

  public static void main(String[] args) {
    //创建自身实例，进行访问
    AA1 aa1 = new AA1();
    //System.out.println(aa1.a);
    System.out.println(aa1.b);
    System.out.println(aa1.c);
    System.out.println(aa1.d);

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
