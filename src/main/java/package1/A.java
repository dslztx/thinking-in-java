package package1;

import package2.AA2;
import package3.AAA;

/**
 * 父类
 *
 * @author dsl
 */
public class A {

  //原生类成员
  public int d;

  //原生类成员
  protected int c;

  //原生类成员
  int b;

  //原生类成员
  private int a;

  public static void main(String[] args) {
    A a = new A();
    System.out.println(a.a);
    System.out.println(a.b);
    System.out.println(a.c);
    System.out.println(a.d);

    AA1 aa1 = new AA1();
    //不能访问，在该类的完整定义中，“a”类成员不存在
    //System.out.println(aa1.a);
    //能访问，引用链中最后一个节点对应地址与“访问者地址”满足“规则集1”
    System.out.println(aa1.b);
    //能访问，引用链中最后一个节点对应地址与“访问者地址”满足“规则集1”
    System.out.println(aa1.c);
    //能访问，引用链中最后一个节点对应地址与“访问者地址”满足“规则集1”
    System.out.println(aa1.d);

    AA2 aa2 = new AA2();
    //不能访问，在该类的完整定义中，“a”类成员不存在
    //System.out.println(aa2.a);
    //不能访问，在该类的完整定义中，“b”类成员不存在
    //System.out.println(aa2.b);
    //能访问，引用链中最后一个节点对应地址与“访问者地址”满足“规则集1”
    System.out.println(aa2.c);
    //能访问，引用链中最后一个节点对应地址与“访问者地址”满足“规则集1”
    System.out.println(aa2.d);

    AAA aaa = new AAA();
    //不能访问，在该类的完整定义中，“a”类成员不存在
    //System.out.println(aaa.a);
    //不能访问，在该类的完整定义中，“b”类成员不存在
    //System.out.println(aaa.b);
    //能访问，引用链中最后一个节点对应地址与“访问者地址”满足“规则集1”
    System.out.println(aaa.c);
    //能访问，引用链中最后一个节点对应地址与“访问者地址”满足“规则集1”
    System.out.println(aaa.d);
  }

}