package chapter21;

import chapter0.PrintUtils;
import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable {

  public static void main(String[] args) throws Exception {
    for (int i = 0; i < 10; i++) {
      Thread daemon = new Thread(new SimpleDaemons());
      daemon.setDaemon(true);
      daemon.start();
    }

    PrintUtils.print("All daemons started");
    TimeUnit.MILLISECONDS.sleep(175);
  }

  public void run() {
    try {
      while (true) {
        TimeUnit.MILLISECONDS.sleep(100);
        PrintUtils.print(Thread.currentThread() + " " + this);
      }
    } catch (InterruptedException e) {
      PrintUtils.print("sleep() interrupted");
    }
  }
}
