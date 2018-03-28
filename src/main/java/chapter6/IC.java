package chapter6;

interface IA {

  //原生成员
  int a = 10;

  //原生成员
  int f();
}

interface IB extends IA {

  //原生成员
  int b = 20;

  //原生成员
  int g();

  //继承成员
  //int a = 10;
  //int f();
}


public interface IC extends IB {

  //继承成员
  //int a = 10;
  //int f();
  //int b = 20;
  //int g();
}
