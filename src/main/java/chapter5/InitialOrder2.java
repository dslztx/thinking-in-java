package chapter5;

public class InitialOrder2 {

  //Ĭ�ϳ�ʼ���Ͷ����ʼ��
  static int i = f(10);

  static {
    System.out.println("�����ʼ���� i:" + i);

    //��̬��ʼ������ʼ��
    i = 20;

    System.out.println("��̬��ʼ������ʼ���� i:" + i);
  }

  public static void main(String[] args) throws ClassNotFoundException {
    Class.forName("chapter5.InitialOrder2");
  }

  public static int f(int a) {
    System.out.println("Ĭ�ϳ�ʼ���� i:" + i);

    return 10;
  }
}
