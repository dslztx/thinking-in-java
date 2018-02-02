package chapter7;

import chapter0.PrintUtils;

class Shape {

  Shape(int i) {
    PrintUtils.print("Shape constructor");
  }

  void dispose() {
    PrintUtils.print("Shape dispose");
  }
}

class Circle extends Shape {

  Circle(int i) {
    super(i);
    PrintUtils.print("Drawing Circle");
  }

  void dispose() {
    PrintUtils.print("Erasing Circle");
    super.dispose();
  }
}

class Triangle extends Shape {

  Triangle(int i) {
    super(i);
    PrintUtils.print("Drawing Triangle");
  }

  void dispose() {
    PrintUtils.print("Erasing Triangle");
    super.dispose();
  }
}

class Line extends Shape {

  private int start, end;

  Line(int start, int end) {
    super(start);
    this.start = start;
    this.end = end;
    PrintUtils.print("Drawing Line: " + start + ", " + end);
  }

  void dispose() {
    PrintUtils.print("Erasing Line: " + start + ", " + end);
    super.dispose();
  }
}

public class CADSystem extends Shape {

  private Circle c;
  private Triangle t;
  private Line[] lines = new Line[3];

  public CADSystem(int i) {
    super(i + 1);
    for (int j = 0; j < lines.length; j++) {
      lines[j] = new Line(j, j * j);
    }
    c = new Circle(1);
    t = new Triangle(1);
    PrintUtils.print("Combined constructor");
  }

  public static void main(String[] args) {
    CADSystem x = new CADSystem(47);
    try {

    } finally {
      x.dispose();
    }
  }

  public void dispose() {
    PrintUtils.print("CADSystem.dispose()");
    t.dispose();
    c.dispose();
    for (int i = lines.length - 1; i >= 0; i--) {
      lines[i].dispose();
    }
    super.dispose();
  }
}
