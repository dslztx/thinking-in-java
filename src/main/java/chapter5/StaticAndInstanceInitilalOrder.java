package chapter5;

class C {

  static int b = 10;
}

class D {

  static int b = 10;

  int a = 10;

  public D() {
    a = 20;
  }
}

public class StaticAndInstanceInitilalOrder {

  public static void main(String[] args) {
    //������C�ľ�̬�����ֶΣ�������C��Class�ļ���������̬��ʼ����û�д�����C��ʵ������δ����ʵ����ʼ��
    System.out.println(C.b);

    //������D�Ĺ��췽����������D��Class�ļ���������̬��ʼ����������D��ʵ����������ʵ����ʼ��
    D d = new D();
  }
}
