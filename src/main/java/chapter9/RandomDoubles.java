package chapter9;

import java.util.Random;

public class RandomDoubles {

  private static Random rand = new Random(47);

  public static void main(String[] args) {
    RandomDoubles rd = new RandomDoubles();
    for (int i = 0; i < 7; i++) {
      System.out.println(rd.next() + " ");
    }
  }

  public double next() {
    return rand.nextDouble();
  }

}
