package chapter6;

interface ICA {

  //ԭ����Ա
  int a = 10;

  //ԭ����Ա
  int f();
}

interface ICB extends ICA {

  //ԭ����Ա
  int b = 20;

  //ԭ����Ա
  int g();

  //�̳г�Ա
  //int a = 10;
  //int f();
}

class ICD {

  //ԭ����Ա
  int c = 30;

  //ԭ����Ա
  int h() {
    return 0;
  }
}

public class ICE extends ICD implements ICA, ICB {

  //ԭ����Ա
  public int f() {
    return 0;
  }

  //ԭ����Ա
  public int g() {
    return 0;
  }

  //�̳г�Ա

  //�̳���ICA
  //int a = 10;
  //int f();

  //�̳���ICB
  //int a = 10;
  //int f();
  //int b = 20;
  //int g();

  //�̳���ICD
  //int c = 30;
  //int h();
}
