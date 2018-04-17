package chapter8.shape;

import chapter0.PrintUtils;

public class Square extends Shape {

  @Override
  public void draw() {
    PrintUtils.print("Square.draw()");
  }

  @Override
  public void erase() {
    PrintUtils.print("Square.erase()");
  }
}
