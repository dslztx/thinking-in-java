package package1;

import package2.AA2;
import package3.AAA;

/**
 * ���ʸ��࣬����1������2�����࣬�����������1ͬ����ע�͵�����Դ��ʾ���ܱ����ʣ�
 *
 * @author dsl
 */
public class B {

  public static void main(String[] args) {
    //��������ʵ�������з���
    A a = new A();
    //System.out.println(a.a);
    System.out.println(a.b);
    System.out.println(a.c);
    System.out.println(a.d);
    //��������1ʵ�������з���
    AA1 aa1 = new AA1();
    //��aa1.a������Դ������
    //System.out.println(aa1.a);
    System.out.println(aa1.b);
    System.out.println(aa1.c);
    System.out.println(aa1.d);
    //��������2ʵ�������з���
    AA2 aa2 = new AA2();
    //��aa2.a������Դ������
    //System.out.println(aa2.a);
    //��aa2.b������Դ������
    //System.out.println(aa2.b);
    System.out.println(aa2.c);
    System.out.println(aa2.d);
    //��������ʵ�������з���
    AAA aaa = new AAA();
    //��aaa.a������Դ������
    //System.out.println(aaa.a);
    //��aaa.b������Դ������
    //System.out.println(aaa.b);
    System.out.println(aaa.c);
    System.out.println(aaa.d);
  }
}