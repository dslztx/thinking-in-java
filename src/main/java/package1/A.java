package package1;

import package2.AA2;
import package3.AAA;

/**
 * ����
 *
 * @author dsl
 */
public class A {

  //ԭ�����Ա
  public int d;

  //ԭ�����Ա
  protected int c;

  //ԭ�����Ա
  int b;

  //ԭ�����Ա
  private int a;

  public static void main(String[] args) {
    A a = new A();
    System.out.println(a.a);
    System.out.println(a.b);
    System.out.println(a.c);
    System.out.println(a.d);

    AA1 aa1 = new AA1();
    //���ܷ��ʣ��ڸ�������������У���a�����Ա������
    //System.out.println(aa1.a);
    //�ܷ��ʣ������������һ���ڵ��Ӧ��ַ�롰�����ߵ�ַ�����㡰����1��
    System.out.println(aa1.b);
    //�ܷ��ʣ������������һ���ڵ��Ӧ��ַ�롰�����ߵ�ַ�����㡰����1��
    System.out.println(aa1.c);
    //�ܷ��ʣ������������һ���ڵ��Ӧ��ַ�롰�����ߵ�ַ�����㡰����1��
    System.out.println(aa1.d);

    AA2 aa2 = new AA2();
    //���ܷ��ʣ��ڸ�������������У���a�����Ա������
    //System.out.println(aa2.a);
    //���ܷ��ʣ��ڸ�������������У���b�����Ա������
    //System.out.println(aa2.b);
    //�ܷ��ʣ������������һ���ڵ��Ӧ��ַ�롰�����ߵ�ַ�����㡰����1��
    System.out.println(aa2.c);
    //�ܷ��ʣ������������һ���ڵ��Ӧ��ַ�롰�����ߵ�ַ�����㡰����1��
    System.out.println(aa2.d);

    AAA aaa = new AAA();
    //���ܷ��ʣ��ڸ�������������У���a�����Ա������
    //System.out.println(aaa.a);
    //���ܷ��ʣ��ڸ�������������У���b�����Ա������
    //System.out.println(aaa.b);
    //�ܷ��ʣ������������һ���ڵ��Ӧ��ַ�롰�����ߵ�ַ�����㡰����1��
    System.out.println(aaa.c);
    //�ܷ��ʣ������������һ���ڵ��Ӧ��ַ�롰�����ߵ�ַ�����㡰����1��
    System.out.println(aaa.d);
  }

}