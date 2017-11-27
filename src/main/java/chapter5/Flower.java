package chapter5;

import static chapter0.PrintUtils.print;

public class Flower {

  int petalCount = 0;
  String s = "initial value";

  Flower(int petals) {
    petalCount = petals;
    print("Constructor w/ int arg only, petalCount= " + petalCount);
  }

  Flower(String ss) {
    print("Constructor w/ String arg only, s = " + ss);
    s = ss;
  }

  Flower(String s, int petals) {
    this(petals);
    this.s = s;
    print("String & int args");
  }

  Flower() {
    this("hi", 47);
    print("default constructor (no args)");
  }

  public static void main(String[] args) {
    Flower x = new Flower();
    x.printPetalCount();
  }

  void printPetalCount() {
    print("petalCount = " + petalCount + " s = " + s);
  }

}
