package chapter4;

import static chapter0.PrintUtils.range;

public class ForEachInt {

  public static void main(String[] args) {
    for (int i : range(10)) {
      System.out.print(i + "\t");
    }
    System.out.println();

    for (int i : range(5, 10)) {
      System.out.print(i + "\t");
    }
    System.out.println();

    for (int i : range(5, 20, 3)) {
      System.out.print(i + "\t");
    }
    System.out.println();
  }
}
