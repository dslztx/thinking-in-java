package modifier;

import java.util.Random;

class CompileConstantExample {

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

  // 编译期常量，编译器优化：编译时完成拼接
  static final String h = "wor" + "ld";

  // 非编译期常量
  static final String i = "world" + rand.nextInt(10) + "ld";

  public static void main(String[] args)
  {
    System.out.println(CompileConstantExample.b);
    System.out.println(CompileConstantExample.d);
    System.out.println(CompileConstantExample.f);
    System.out.println(CompileConstantExample.h);
    System.out.println(CompileConstantExample.i);

    CompileConstantExample compileConstantExample = new CompileConstantExample();
    System.out.println(compileConstantExample.a);
    System.out.println(compileConstantExample.c);
    System.out.println(compileConstantExample.e);
    System.out.println(compileConstantExample.g);
  }

}