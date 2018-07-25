public class Main {

  int c = 10;
  int a = g();

  public static void main(String[] args) {
    Main main = new Main();
    Thread.currentThread().getState();
    System.out.println(main.a);
  }

  int g() {
    return c;
  }
}