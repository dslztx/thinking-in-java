package chapter3;

import static chapter0.PrintUtils.print;

public class Equivalence {

  public static void main(String[] args) {
    Integer n1 = new Integer(47);
    Integer n2 = new Integer(47);

    Integer n3 = 10;
    Integer n4 = 10;

    print(n1 == n2);
    print(n1 != n2);
    print(n3 == n4);
  }
}
