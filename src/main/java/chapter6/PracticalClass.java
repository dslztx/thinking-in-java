package chapter6;

class AA {

  //原生成员
  int a;

  //原生成员
  int f() {
    return 0;
  }
}

class BB extends AA {

  //原生成员
  int c;

  //原生成员
  int g() {
    return 0;
  }

  //继承成员
  //int a;
  //int f();
}

public class PracticalClass extends BB {
  //继承成员
  //int a;
  //int f();
  //int c;
  //int g();
}
