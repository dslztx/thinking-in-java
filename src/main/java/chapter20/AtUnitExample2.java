package chapter20;

import chapter0.OSExecute;
import java.io.FileInputStream;
import java.io.IOException;

public class AtUnitExample2 {

  public String methodOne() {
    return "This is methodOne";
  }

  public int methodTwo() {
    System.out.println("This is methodTwo");
    return 2;
  }

  @Test
  void assertExample() {
    assert methodOne().equals("This is methodOne");
  }

  @Test
  void assertFailureExample() {
    assert 1 == 2 : "What a surprisle!";
  }

  @Test
  void exceptionExample() throws IOException {
    new FileInputStream("nofile.txt");
  }

  @Test
  boolean assertAndReturn() {
    assert methodTwo() == 2;
    return methodOne().equals("This is methodOne");
  }

  public static void main(String[] args) {
    OSExecute.command("java net.mindview.atunit.AtUnit AtUnitExample2");
  }
}
