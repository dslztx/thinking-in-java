package chapter6;

interface ICA {

  //原生成员
  int a = 10;

  //原生成员
  int f();
}

interface ICB extends ICA {

  //原生成员
  int b = 20;

  //原生成员
  int g();

  //继承成员
  //int a = 10;
  //int f();
}

class ICD {

  //原生成员
  int c = 30;

  //原生成员
  int h() {
    return 0;
  }
}

public class ICE extends ICD implements ICA, ICB {

  //原生成员
  public int f() {
    return 0;
  }

  //原生成员
  public int g() {
    return 0;
  }

  //继承成员

  //继承自ICA
  //int a = 10;
  //int f();

  //继承自ICB
  //int a = 10;
  //int f();
  //int b = 20;
  //int g();

  //继承自ICD
  //int c = 30;
  //int h();
}
