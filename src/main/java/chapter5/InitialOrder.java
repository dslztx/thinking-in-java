package chapter5;

public class InitialOrder {

  //Ĭ�ϳ�ʼ���Ͷ����ʼ��
  int i = f(10);

  {
    System.out.println("�����ʼ���� i:" + i);

    //ʵ����ʼ������ʼ��
    i = 20;

    System.out.println("ʵ����ʼ������ʼ���� i:" + i);
  }

  public InitialOrder() {
    //��������ʼ��
    i = 30;

    System.out.println("��������ʼ���� i:" + i);
  }

  public static void main(String[] args) {
    new InitialOrder();
  }

  public int f(int a) {
    System.out.println("Ĭ�ϳ�ʼ���� i:" + i);

    return 10;
  }
}
