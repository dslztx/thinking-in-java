package com.dslztx.package1;

public class ThreeLevel {

  public static void main(String[] args) {
    GrandFather grandFather = new Child();
    grandFather.f();
  }
}

class GrandFather {

  public void f() {
    System.out.println("GrandFather");
  }
}

class Parent extends GrandFather {

}

class Child extends Parent {

  public void f() {
    System.out.println("Child");
  }
}
