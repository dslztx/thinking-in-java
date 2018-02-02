package chapter7;

import chapter0.PrintUtils;

class Plate {

  Plate(int i) {
    PrintUtils.print("Plate constructor");
  }
}

class DinnerPlate extends Plate {

  DinnerPlate(int i) {
    super(i);
    PrintUtils.print("DinnerPlate constructor");
  }
}

class Utensil {

  Utensil(int i) {
    PrintUtils.print("Utensil constructor");
  }
}

class Spoon extends Utensil {

  Spoon(int i) {
    super(i);
    PrintUtils.print("Spoon constructor");
  }
}

class Fork extends Utensil {

  Fork(int i) {
    super(i);
    PrintUtils.print("Fork constructor");
  }
}

class Knife extends Utensil {

  Knife(int i) {
    super(i);
    PrintUtils.print("Knife constructor");
  }
}

class Custom {

  Custom(int i) {
    PrintUtils.print("Custom constructor");
  }
}

public class PlaceSetting extends Custom {

  private Spoon sp;
  private Fork frk;
  private Knife kn;
  private DinnerPlate pl;

  PlaceSetting(int i) {
    super(i + 1);
    sp = new Spoon(i + 2);
    frk = new Fork(i + 3);
    kn = new Knife(i + 4);
    pl = new DinnerPlate(i + 5);
    PrintUtils.print("PlaceSetting constructor");
  }

  public static void main(String[] args) {
    PlaceSetting x = new PlaceSetting(9);
  }
}
