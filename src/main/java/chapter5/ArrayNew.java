package chapter5;

import chapter0.PrintUtils;
import java.util.Arrays;
import java.util.Random;

public class ArrayNew {

  public static void main(String[] args) {
    int[] a;
    Random rand = new Random(47);
    a = new int[rand.nextInt(20)];
    PrintUtils.print("length of a = " + a.length);
    PrintUtils.print(Arrays.toString(a));
  }

}
