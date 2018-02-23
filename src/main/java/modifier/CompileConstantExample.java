package modifier;

import java.util.Random;

class CompileConstantExample {

  private static final Random rand = new Random();

  // �����ڳ���
  final int a = 10;

  // �����ڳ���
  static final boolean b = true;

  // �����ڳ���
  final String c = "hello";

  // �����ڳ���
  static final String d = "world";


  // �Ǳ����ڳ���
  final int e = new Integer(10);

  // �Ǳ����ڳ���
  static final int f = rand.nextInt(10);

  // �Ǳ����ڳ���
  final String g = new String("hello");

  // �����ڳ������������Ż�������ʱ���ƴ��
  static final String h = "wor" + "ld";

  // �Ǳ����ڳ���
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