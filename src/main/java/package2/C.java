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
    A a = new A();
    //���ܷ��ʣ������Ա��ַ���롰�����ߵ�ַ�������㡰����1��
    //System.out.println(a.a);
    //���ܷ��ʣ������Ա��ַ���롰�����ߵ�ַ�������㡰����1��
    //System.out.println(a.b);
    //���ܷ��ʣ������Ա��ַ���롰�����ߵ�ַ�������㡰����1��
    //System.out.println(a.c);
    System.out.println(a.d);

    AA1 aa1 = new AA1();
    //���ܷ��ʣ��ڸ�������������У���a�����Ա������
    //System.out.println(aa1.a);
    //���ܷ��ʣ�������2��������
    //System.out.println(aa1.b);
    //���ܷ��ʣ�������2��������
    //System.out.println(aa1.c);
    //�ܷ��ʣ������������һ���ڵ��Ӧ��ַ�롰�����ߵ�ַ�����㡰����1��
    System.out.println(aa1.d);

    AA2 aa2 = new AA2();
    //���ܷ��ʣ��ڸ�������������У���a�����Ա������
    //System.out.println(aa2.a);
    //���ܷ��ʣ��ڸ�������������У���b�����Ա������
    //System.out.println(aa2.b);
    //���ܷ��ʣ�������2��������
    //System.out.println(aa2.c);
    //�ܷ��ʣ������������һ���ڵ��Ӧ��ַ�롰�����ߵ�ַ�����㡰����1��
    System.out.println(aa2.d);

    AAA aaa = new AAA();
    //���ܷ��ʣ��ڸ�������������У���a�����Ա������
    //System.out.println(aaa.a);
    //���ܷ��ʣ��ڸ�������������У���b�����Ա������
    //System.out.println(aaa.b);
    //���ܷ��ʣ�������2��������
    //System.out.println(aaa.c);
    //�ܷ��ʣ������������һ���ڵ��Ӧ��ַ�롰�����ߵ�ַ�����㡰����1��
    System.out.println(aaa.d);
  }
}