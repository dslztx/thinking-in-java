package modifier;

import java.util.Random;

interface B {

  Random rand = new Random();

  int a = 10;

  int b = C.f();

  int c = rand.nextInt(10);

  String d = "hel" + "lo";
}

class C {

  public static int f() {
    System.out.println("����C���f()����");
    return 10;
  }

}

public class CompileConstantInInterface {

  public static void main(String[] args) {

    //ÿ��ֻ����B��һ���ֶΣ�������֤

//    System.out.println(B.a);
//    System.out.println(B.b);
//    System.out.println(B.c);
    System.out.println(B.d);

  }
}
