package package2;

import package1.A;
import package1.AA1;
import package3.AAA;

/**
 * ���ʸ��࣬����1������2�����࣬������2ͬ����ע�͵�����Դ��ʾ���ܱ����ʣ�
 *
 * @author dsl
 */
public class C {

  public static void main(String[] args) {
    //��������ʵ�������з���
    A a = new A();
    //System.out.println(a.a);
    //System.out.println(a.b);
    //System.out.println(a.c);
    System.out.println(a.d);
    //��������1ʵ�������з���
    AA1 aa1 = new AA1();
    //��aa1.a������Դ������
    //System.out.println(aa1.a);
    //��aa1.b������Դ���ڣ����ǲ��ɷ���ʵ�ʵ�ַ
    //System.out.println(aa1.b);
    //��aa1.c������Դ���ڣ����ǲ��ɷ���ʵ�ʵ�ַ
    //System.out.println(aa1.c);
    System.out.println(aa1.d);
    //��������2ʵ�������з���
    AA2 aa2 = new AA2();
    //��aa2.a������Դ������
    //System.out.println(aa2.a);
    //��aa2.b������Դ������
    //System.out.println(aa2.b);
    //��aa2.c������Դ���ڣ����ǲ��ɷ���ʵ�ʵ�ַ
    //System.out.println(aa2.c);
    System.out.println(aa2.d);
    //��������ʵ�������з���
    AAA aaa = new AAA();
    //��aaa.a������Դ������
    //System.out.println(aaa.a);
    //��aaa.b������Դ������
    //System.out.println(aaa.b);
    //��aaa.c������Դ���ڣ����ǲ��ɷ���ʵ�ʵ�ַ
    //System.out.println(aaa.c);
    System.out.println(aaa.d);
  }
}