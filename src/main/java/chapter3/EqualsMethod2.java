package chapter3;

import static chapter0.PrintUtils.print;

class Value {

  int i;
}

public class EqualsMethod2 {

  public static void main(String[] args) {
    Value v1 = new Value();
    Value v2 = new Value();
    v1.i = v2.i = 100;
    print(v1.equals(v2));
  }

}
