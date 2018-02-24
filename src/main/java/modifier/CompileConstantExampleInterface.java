package modifier;

import java.util.Random;

public interface CompileConstantExampleInterface {

  int a = 10;

  String b = "hello";

  Random rand = new Random();

  int c = rand.nextInt(10);

  String d = "he" + rand.nextInt(10) + "llo";

}

class VisitClass {

  public static void main(String[] args) {
    System.out.println(CompileConstantExampleInterface.a);
    System.out.println(CompileConstantExampleInterface.b);
    System.out.println(CompileConstantExampleInterface.c);
    System.out.println(CompileConstantExampleInterface.d);
  }

}
