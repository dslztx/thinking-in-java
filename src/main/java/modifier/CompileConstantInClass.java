package modifier;

class A {

  static {
    System.out.println("触发类对象初始化的标志");
  }

  static int a = 10;

  static final int b = 20;

  static String c = "hello";

  static final String d = "world";

  static final String e = "wor" + "ld";
}

public class CompileConstantInClass {

  public static void main(String[] args) {

    //每次只访问A中一个字段，进行验证

//    System.out.println(A.a);
//    System.out.println(A.b);
//    System.out.println(A.c);
//    System.out.println(A.d);
    System.out.println(A.e);
  }

}
