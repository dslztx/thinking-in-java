package chapter6;

class AA {

  // ԭ�����Ա
  int a;

  // ԭ�����Ա
  int f() {
    return 0;
  }
}

class BB extends AA {

  // ԭ�����Ա
  int c;

  // ԭ�����Ա
  int g() {
    return 0;
  }

  // ��BB����������Ӧ�ð���������Щ���������Ա��

  // int a;
  // int f() { return 0; }
}

public class PracticalClass extends BB {
  // ��PracticalClass�������������������Щ���������Ա��

  // int a;
  // int f() { return 0; }

  // int c;
  // int g() { return 0; }
}
