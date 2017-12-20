package chapter5;

public class InitialOrder2 {

  public static void main(String[] args) throws ClassNotFoundException {
    //如果第一次遇见ExperimentObject类的声明，创建类对象，且触发“默认初始化”
    ExperimentObject object = null;
    //如果ExperimentObject类对象已经创建，则触发“定义初始化和静态初始化语句初始化”；否则创建ExperimentObject类对象，且触发“默认初始化，定义初始化，静态初始化语句初始化”
    Class.forName("chapter5.ExperimentObject");
  }
}

class ExperimentObject {

  //默认初始化和定义初始化
  static int i = f(10);

  static {
    System.out.println("定义初始化后 i:" + i);
    //静态初始化语句初始化
    i = 20;
    System.out.println("静态初始化语句初始化后 i:" + i);
  }

  public static int f(int a) {
    System.out.println("默认初始化后 i:" + i);
    return 10;
  }
}