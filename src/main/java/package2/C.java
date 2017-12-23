package package2;

import package1.A;
import package1.AA1;
import package3.AAA;

/**
 * 访问父类，子类1，子类2，孙类，跟子类2同包（注释掉的资源表示不能被访问）
 *
 * @author dsl
 */
public class C {

  public static void main(String[] args) {
    //创建父类实例，进行访问
    A a = new A();
    //System.out.println(a.a);
    //System.out.println(a.b);
    //System.out.println(a.c);
    System.out.println(a.d);
    //创建子类1实例，进行访问
    AA1 aa1 = new AA1();
    //“aa1.a”软资源不存在
    //System.out.println(aa1.a);
    //“aa1.b”软资源存在，但是不可访问实际地址
    //System.out.println(aa1.b);
    //“aa1.c”软资源存在，但是不可访问实际地址
    //System.out.println(aa1.c);
    System.out.println(aa1.d);
    //创建子类2实例，进行访问
    AA2 aa2 = new AA2();
    //“aa2.a”软资源不存在
    //System.out.println(aa2.a);
    //“aa2.b”软资源不存在
    //System.out.println(aa2.b);
    //“aa2.c”软资源存在，但是不可访问实际地址
    //System.out.println(aa2.c);
    System.out.println(aa2.d);
    //创建孙类实例，进行访问
    AAA aaa = new AAA();
    //“aaa.a”软资源不存在
    //System.out.println(aaa.a);
    //“aaa.b”软资源不存在
    //System.out.println(aaa.b);
    //“aaa.c”软资源存在，但是不可访问实际地址
    //System.out.println(aaa.c);
    System.out.println(aaa.d);
  }
}