package chapter5;

public class InitialOrder {

  //默认初始化和定义初始化
  int i = f(10);

  {
    System.out.println("定义初始化后 i:" + i);

    //实例初始化语句初始化
    i = 20;

    System.out.println("实例初始化语句初始化后 i:" + i);
  }

  public InitialOrder() {
    //构造器初始化
    i = 30;

    System.out.println("构造器初始化后 i:" + i);
  }

  public static void main(String[] args) {
    new InitialOrder();
  }

  public int f(int a) {
    System.out.println("默认初始化后 i:" + i);

    return 10;
  }
}
