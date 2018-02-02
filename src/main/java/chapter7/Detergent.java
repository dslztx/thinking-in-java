package chapter7;

import chapter0.PrintUtils;

class Cleanser {

  private String s = "Cleanser";

  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute();
    x.apply();
    x.scrub();
    PrintUtils.print(x);
  }

  public void append(String a) {
    s += a;
  }

  public void dilute() {
    append(" dilute()");
  }

  public void apply() {
    append(" apply()");
  }

  public void scrub() {
    append(" scrub()");
  }

  public String toString() {
    return s;
  }
}

public class Detergent extends Cleanser {

  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    PrintUtils.print(x);
    PrintUtils.print("Testing base class:");
    Cleanser.main(args);
  }

  public void scrub() {
    append(" Detergent.scrub()");
    super.scrub();
  }

  public void foam() {
    append(" foam()");
  }
}
