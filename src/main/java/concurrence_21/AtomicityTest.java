package concurrence_21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AtomicityTest implements Runnable {

  private int i = 0;

  public static void main(String[] args) {
    ExecutorService exec = Executors.newCachedThreadPool();
    AtomicityTest at = new AtomicityTest();
    exec.execute(at);
    while (true) {
      int val = at.getValue();
      if (val % 2 != 0) {
        System.out.println(val);
        System.exit(0);
      }
    }
  }

  public int getValue() {
    return i;
  }

  private synchronized void evenIncrement() throws InterruptedException {
    i++;
    TimeUnit.MILLISECONDS.sleep(3);
    i++;
  }

  public void run() {
    while (true) {
      try {
        evenIncrement();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
