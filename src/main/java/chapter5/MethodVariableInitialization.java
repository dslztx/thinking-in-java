package chapter5;

public class MethodVariableInitialization {

  void f() {
    int b;
    //编译出错，提示变量b未被初始化
    /*System.out.println(b);*/
  }
}
