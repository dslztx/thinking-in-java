package chapter21;

import chapter0.PrintUtils;
import java.util.concurrent.TimeUnit;

class ADaemon implements Runnable {

  public void run() {
    try {
      PrintUtils.print("Starting ADaemon");
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      PrintUtils.print("Exiting via InterruptedException");
    } finally {
      PrintUtils.print("This should always run?");
    }
  }
}

public class DaemonsDontRunFinally {

  public static void main(String[] args) {
    Thread t = new Thread(new ADaemon());
    t.setDaemon(true);
    t.start();
  }

}
