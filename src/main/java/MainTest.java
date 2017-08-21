class TaskTest implements Runnable {

  public void run() {
    int cnt = 0;
    while (true) {
      System.out.println("cnt: " + cnt++);
      Thread.yield();
    }
  }
}

public class MainTest {

  public static void main(String[] args) throws InterruptedException {
    new Thread(new TaskTest()).start();
    Thread.sleep(30000);
    System.out.println("helel");
    throw new RuntimeException("test");
  }

}
