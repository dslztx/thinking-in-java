package concurrence_21;

import java.util.concurrent.TimeUnit;

class ADaemon implements Runnable {

  public void run() {
    try {
      System.out.println("Starting DaemonsDontRunFinally");
      TimeUnit.SECONDS.sleep(1);
    } catch (Exception e) {
      System.out.println("Exiting via InterruptedException");
    } finally {
      System.out.println("This should always run?");
    }
  }
}

public class DaemonsDontRunFinally {

  public static void main(String[] args) throws InterruptedException {
    Thread t = new Thread(new ADaemon());
    t.setDaemon(true);
    t.start();
    TimeUnit.MILLISECONDS.sleep(500);
  }
}
