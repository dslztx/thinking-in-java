package chapter5;

public class InitialOrder {

  int i = f(10);

  {
    System.out.println("second initla i : " + i);
    i = 20;
    System.out.println("third initla i : " + i);
  }

  public InitialOrder() {
    i = 30;
    System.out.println("fourth initla i : " + i);
  }

  public static void main(String[] args) {
    new InitialOrder();
  }

  public int f(int a) {
    System.out.println("first initial i : " + i);

    return 10;
  }

  //ֻ��Գ�������߾����࣬�Ҳ������̳й�ϵ

  ��ʼ��
  ����
      ����
}
