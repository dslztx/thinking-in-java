package chapter5;

import chapter0.PrintUtils;

public class PrimitiveOverloading {

  void f1(char x) {
    PrintUtils.printnb("f1(char) ");
  }

  void f1(byte x) {
    PrintUtils.printnb("f1(byte) ");
  }

  void f1(short x) {
    PrintUtils.printnb("f1(short) ");
  }

  void f1(int x) {
    PrintUtils.printnb("f1(int) ");
  }

  void f1(long x) {
    PrintUtils.printnb("f1(long) ");
  }

  void f1(float x) {
    PrintUtils.printnb("f1(float) ");
  }

  void f1(double x) {
    PrintUtils.printnb("f1(double) ");
  }


}
