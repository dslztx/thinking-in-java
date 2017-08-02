package concurrence_21;

public class InheritanceThread extends Thread {

  public static void main(String[] args) {
    Thread thread = new InheritanceThread();
    thread.start();
  }

  @Override
  public void run() {
    int sum = 0;
    for (int i = 0; i < 100; i++) {
      sum += i;
    }
    System.out.print(sum);
  }
}
