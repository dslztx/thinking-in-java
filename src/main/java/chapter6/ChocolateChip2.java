package chapter6;

import chapter6.access.cookie2.Cookie2;

public class ChocolateChip2 extends Cookie2 {

  public ChocolateChip2() {
    System.out.println("ChocolateChip2 constructor");
  }

  public static void main(String[] args) {
    ChocolateChip2 x = new ChocolateChip2();
    x.chomp();

  }

  public void chomp() {
    bite();
  }

}
