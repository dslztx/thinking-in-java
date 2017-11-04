package chapter3;

import chapter0.PrintUtils;

public class RoundingNumbers {

  public static void main(String[] args) {
    double above = 0.7, below = 0.4;
    float fabove = 0.7f, fbelow = 0.4f;
    PrintUtils.print("Math.round(above): " + Math.round(above));
    PrintUtils.print("Math.round(below): " + Math.round(below));
    PrintUtils.print("Math.round(fabove): " + Math.round(fabove));
    PrintUtils.print("Math.round(fbelow): " + Math.round(fbelow));
  }

}
