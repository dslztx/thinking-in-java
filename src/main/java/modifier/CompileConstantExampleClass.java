package modifier;

import java.util.Random;

class CompileConstantExampleClass {

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

  // �Ǳ����ڳ���
  final int j;

  {
    j = 20;
  }

  // �Ǳ����ڳ���
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

    CompileConstantExampleClass compileConstantExampleClass = new CompileConstantExampleClass();
    System.out.println(compileConstantExampleClass.a);
    System.out.println(compileConstantExampleClass.c);
    System.out.println(compileConstantExampleClass.e);
    System.out.println(compileConstantExampleClass.g);
    System.out.println(compileConstantExampleClass.j);
  }

}