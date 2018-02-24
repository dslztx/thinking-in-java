package modifier;

import java.util.Random;

class CompileConstantExampleClass {

  private static final Random rand = new Random();

  // 编译期常量
  final int a = 10;

  // 编译期常量
  static final boolean b = true;

  // 编译期常量
  final String c = "hello";

  // 编译期常量
  static final String d = "world";


  // 非编译期常量
  final int e = new Integer(10);

  // 非编译期常量
  static final int f = rand.nextInt(10);

  // 非编译期常量
  final String g = new String("hello");

  // 编译期常量，编译期优化：编译时完成拼接
  static final String h = "wor" + "ld";

  // 编译期常量
  static final int p = 10 + 20;

  // 编译期常量
  static final String q = d + " beautiful";

  // 编译期常量
  static final int r = 10 - 20;

  // 编译期常量
  static final int s = 10 * 20;

  // 编译期常量
  static final int t = 20 / 10;

  // 非编译期常量
  static final String i = "world" + rand.nextInt(10) + "ld";

  // 非编译期常量
  final int j;

  {
    j = 20;
  }

  // 非编译期常量
  static final String k;

  static {
    k = "world";
  }

  public static void main(String[] args)
  {
    System.out.println(CompileConstantExampleClass.b);
    System.out.println(CompileConstantExampleClass.d);
    System.out.println(CompileConstantExampleClass.f);
    System.out.println(CompileConstantExampleClass.h);
    System.out.println(CompileConstantExampleClass.i);
    System.out.println(CompileConstantExampleClass.k);
    System.out.println(CompileConstantExampleClass.p);
    System.out.println(CompileConstantExampleClass.q);
    System.out.println(CompileConstantExampleClass.r);
    System.out.println(CompileConstantExampleClass.s);
    System.out.println(CompileConstantExampleClass.t);

    CompileConstantExampleClass compileConstantExampleClass = new CompileConstantExampleClass();
    System.out.println(compileConstantExampleClass.a);
    System.out.println(compileConstantExampleClass.c);
    System.out.println(compileConstantExampleClass.e);
    System.out.println(compileConstantExampleClass.g);
    System.out.println(compileConstantExampleClass.j);

    // 编译期常量
    final int l = 10;

    // 编译期常量
    final String m = "world";

    // 非编译期常量
    final int n = rand.nextInt(10);

    // 非编译期常量
    final String o = "hell" + rand.nextInt(10) + "o";

    System.out.println(l);
    System.out.println(m);
    System.out.println(n);
    System.out.println(o);

  }

}