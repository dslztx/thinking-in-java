package chapter3;

import static chapter0.PrintUtils.print;

import java.util.Random;

public class Bool {

  public static void main(String[] args) {
    Random random = new Random(47);
    int i = random.nextInt(100);
    int j = random.nextInt(100);

    print("i = " + i);
    print("j = " + j);
    print("i > j is " + (i > j));
    print("i < j is " + (i < j));
    print("i >= j is " + (i >= j));
    print("i <= j is " + (i <= j));
    print("i == j is " + (i == j));
    print("i != j is " + (i != j));
    print("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
    print("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
  }
}
