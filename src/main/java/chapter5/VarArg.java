package chapter5;

public class VarArg {

  public void f(int... a) {
    for (int aa : a) {
      System.out.println(aa);
    }
  }

  public void g(Object... b) {
    for (Object bb : b) {
      System.out.println(bb);
    }
  }
}
