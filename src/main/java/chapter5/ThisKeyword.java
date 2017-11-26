package chapter5;

public class ThisKeyword {

  int a;
  int b;

  public ThisKeyword(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public ThisKeyword(int a) {
    this(a, 10);
  }

  public void setA(int A) {
    this.a = A;
  }

  public ThisKeyword getThisInstance() {
    return this;
  }

}
