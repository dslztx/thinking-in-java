package chapter8;

import chapter0.PrintUtils;

class Meal {

  Meal() {
    PrintUtils.print("Meal()");
  }
}

class Bread {

  Bread() {
    PrintUtils.print("Bread()");
  }
}

class Cheese {

  Cheese() {
    PrintUtils.print("Cheese()");
  }
}

class Lettuce {

  Lettuce() {
    PrintUtils.print("Lettuce()");
  }
}

class Lunch extends Meal {

  Lunch() {
    PrintUtils.print("Lunch()");
  }
}

class PortableLunch extends Lunch {

  PortableLunch() {
    PrintUtils.print("PortableLunch()");
  }
}

public class Sandwich extends PortableLunch {

  private Bread b = new Bread();
  private Cheese c = new Cheese();
  private Lettuce l = new Lettuce();

  public Sandwich() {
    PrintUtils.print("Sandwich()");
  }

  public static void main(String[] args) {
    new Sandwich();
  }

}
