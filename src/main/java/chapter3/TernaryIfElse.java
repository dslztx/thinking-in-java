package chapter3;

import static chapter0.PrintUtils.print;

public class TernaryIfElse {

  static int ternary(int i) {
    return i < 10 ? i * 100 : i * 10;
  }

  static int stanardIfElse(int i) {
    if (i < 10) {
      return i * 100;
    } else {
      return i * 10;
    }
  }

  public static void main(String[] args) {
    print(ternary(9));
    print(ternary(10));
    print(stanardIfElse(9));
    print(stanardIfElse(10));
  }

}
