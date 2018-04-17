package chapter8.shape;

import chapter0.PrintUtils;

public class Triangle extends Shape {

  @Override
  public void draw() {
    PrintUtils.print("Triangle.draw()");
  }

  @Override
  public void erase() {
    PrintUtils.print("Triangle.erase()");
  }
}
