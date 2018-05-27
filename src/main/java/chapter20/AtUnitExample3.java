package chapter20;

import chapter0.OSExecute;
import net.mindview.atunit.TestObjectCreate;

public class AtUnitExample3 {

  private int n;

  public AtUnitExample3(int n) {
    this.n = n;
  }

  public int getN() {
    return n;
  }

  public String methodOne() {
    return "This is methodOne";
  }

  public int methodTwo() {
    System.out.println("This is methodTwo");
    return 2;
  }

  @TestObjectCreate
  static AtUnitExample3 create() {
    return new AtUnitExample3(47);
  }

  @Test
  boolean initialization() {
    return n == 47;
  }

  @Test
  boolean methodOneTest() {
    return methodOne().equals("This is methodOne");
  }

  @Test
  boolean m2() {
    return methodTwo() == 2;
  }

  public static void main(String[] args) {
    OSExecute.command("java net.mindview.atunit.AtUnit AtUnitExample3");
  }
}
