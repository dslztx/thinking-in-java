package chapter6;

interface IA {

  //ԭ����Ա
  int a = 10;

  //ԭ����Ա
  int f();
}

interface IB extends IA {

  //ԭ����Ա
  int b = 20;

  //ԭ����Ա
  int g();

  //�̳г�Ա
  //int a = 10;
  //int f();
}


public interface IC extends IB {

  //�̳г�Ա
  //int a = 10;
  //int f();
  //int b = 20;
  //int g();
}
