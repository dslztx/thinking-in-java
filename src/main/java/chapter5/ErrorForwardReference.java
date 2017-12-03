package chapter5;

public class ErrorForwardReference {

  int j = g(10);
  int i = f(j);

  public int f(int a) {
    return a * 10;
  }

  public int g(int b) {
    return b * 20;
  }
}
