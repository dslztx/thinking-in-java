package chapter6;

public class ChocolateChip extends Cookie {

  public ChocolateChip() {
    System.out.println("ChocolateChip constructor");
  }

  public static void main(String[] args) {
    ChocolateChip x = new ChocolateChip();
    x.chomp();
  }

  public void chomp() {
  }

}
