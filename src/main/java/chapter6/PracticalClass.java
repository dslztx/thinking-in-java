package chapter6;

class AA {

  // 原生类成员
  int a;

  // 原生类成员
  int f() {
    return 0;
  }
}

class BB extends AA {

  // 原生类成员
  int c;

  // 原生类成员
  int g() {
    return 0;
  }

  // 类BB的完整定义应该包括下面这些“复制类成员”

  // int a;
  // int f() { return 0; }
}

public class PracticalClass extends BB {
  // 类PracticalClass的完整定义包括下面这些“复制类成员”

  // int a;
  // int f() { return 0; }

  // int c;
  // int g() { return 0; }
}
