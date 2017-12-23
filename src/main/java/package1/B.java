package package1;

import package2.AA2;
import package3.AAA;

/**
 * 访问父类，子类1，子类2，孙类，跟父类和子类1同包（注释掉的资源表示不能被访问）
 *
 * @author dsl
 */
public class B {

  public static void main(String[] args) {
    //创建父类实例，进行访问
    A a = new A();
    //System.out.println(a.a);
    System.out.println(a.b);
    System.out.println(a.c);
    System.out.println(a.d);
    //创建子类1实例，进行访问
    AA1 aa1 = new AA1();
    //“aa1.a”软资源不存在
    //System.out.println(aa1.a);
    System.out.println(aa1.b);
    System.out.println(aa1.c);
    System.out.println(aa1.d);
    //创建子类2实例，进行访问
    AA2 aa2 = new AA2();
    //“aa2.a”软资源不存在
    //System.out.println(aa2.a);
    //“aa2.b”软资源不存在
    //System.out.println(aa2.b);
    System.out.println(aa2.c);
    System.out.println(aa2.d);
    //创建孙类实例，进行访问
    AAA aaa = new AAA();
    //“aaa.a”软资源不存在
    //System.out.println(aaa.a);
    //“aaa.b”软资源不存在
    //System.out.println(aaa.b);
    System.out.println(aaa.c);
    System.out.println(aaa.d);
  }
}