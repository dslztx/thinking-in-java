package chapter5;

public class Overloading {

  public static void main(String[] args) {
    Overloading o = new Overloading();

    byte a = 10;
    o.f(a);

    o.g(o);

    o.h(a);

    o.j(o);
  }

  public void f(short a) {
    System.out.println("f(short)");
  }

  public void g(Object a) {
    System.out.println("g(Object)");
  }

  public void h(short a) {
    System.out.println("h(short)");
  }

  public void h(byte a) {
    System.out.println("h(byte)");
  }

  public void j(Object a) {
    System.out.println("j(Object)");
  }

  public void j(Overloading a) {
    System.out.println("j(Overloading)");
  }
}
