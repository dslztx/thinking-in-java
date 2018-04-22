package chapter9;

interface A {

}


public class InterfaceExtendsObjectIs {

  public void g() throws CloneNotSupportedException {
    super.clone();
  }

  void f(A a) throws InterruptedException {
    System.out.println(a.hashCode());
    System.out.println(a.toString());
    a.wait(1000);
  }

}
