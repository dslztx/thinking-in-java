package chapter5;

public class InitialOrder2 {

  public static void main(String[] args) throws ClassNotFoundException {
    //�����һ������ExperimentObject�������������������Ҵ�����Ĭ�ϳ�ʼ����
    ExperimentObject object = null;
    //���ExperimentObject������Ѿ��������򴥷��������ʼ���;�̬��ʼ������ʼ���������򴴽�ExperimentObject������Ҵ�����Ĭ�ϳ�ʼ���������ʼ������̬��ʼ������ʼ����
    Class.forName("chapter5.ExperimentObject");
  }
}

class ExperimentObject {

  //Ĭ�ϳ�ʼ���Ͷ����ʼ��
  static int i = f(10);

  static {
    System.out.println("�����ʼ���� i:" + i);
    //��̬��ʼ������ʼ��
    i = 20;
    System.out.println("��̬��ʼ������ʼ���� i:" + i);
  }

  public static int f(int a) {
    System.out.println("Ĭ�ϳ�ʼ���� i:" + i);
    return 10;
  }
}