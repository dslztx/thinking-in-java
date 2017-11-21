package chapter5;

public class InitialOrder2 {

  //默认初始化和定义初始化
  static int i = f(10);

  static {
    System.out.println("定义初始化后 i:" + i);

    //静态初始化语句初始化
    i = 20;

    System.out.println("静态初始化语句初始化后 i:" + i);
  }

  public static void main(String[] args) throws ClassNotFoundException {
    Class.forName("chapter5.InitialOrder2");
  }

  public static int f(int a) {
    System.out.println("默认初始化后 i:" + i);

    return 10;
  }
}
