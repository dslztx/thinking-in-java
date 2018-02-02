package chapter7;

import chapter0.PrintUtils;

class Art {

  Art() {
    PrintUtils.print("Art constructor");
  }
}

class Drawing extends Art {

  Drawing() {
    PrintUtils.print("Drawing constructor");
  }
}

public class Cartoon extends Drawing {

  public Cartoon() {
    PrintUtils.print("Cartoon constructor");
  }

  public static void main(String[] args) {
    Cartoon x = new Cartoon();
  }
}
