package chapter4;

import static chapter0.PrintUtils.print;

public class IFElse {

  static int result = 0;

  static void test(int testval, int target) {
    if (testval > target) {
      result = +1;
    } else if (testval < target) {
      result = -1;
    } else {
      result = 0;
    }
  }

  public static void main(String[] args) {
    test(10, 5);
    print(result);

    test(5, 10);
    print(result);

    test(5, 5);
    print(result);
  }

}
