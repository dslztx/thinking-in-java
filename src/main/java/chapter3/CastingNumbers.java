package chapter3;

import chapter0.PrintUtils;

public class CastingNumbers {

  public static void main(String[] args) {
    double above = 0.7, below = 0.4;
    float fabove = 0.7f, fbelow = 0.4f;
    PrintUtils.print("(int)above: " + (int) above);
    PrintUtils.print("(int)below: " + (int) below);
    PrintUtils.print("(int)fabove: " + (int) fabove);
    PrintUtils.print("(int)fbelow: " + (int) fbelow);
  }

}
