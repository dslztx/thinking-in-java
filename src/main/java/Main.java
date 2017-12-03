public class Main {
  int a = g();
  int g() {
    return c;
  }
  public static void main(String[] args) {
    Main main = new Main();
    System.out.println(main.a);
  }
  int c = 10;
}