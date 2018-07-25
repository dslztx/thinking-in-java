package chapter21;

import chapter0.PrintUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable {

  public static void main(String[] args) throws Exception {
    ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());

    for (int i = 0; i < 10; i++) {
      exec.execute(new DaemonFromFactory());
    }
    PrintUtils.print("All daemons started");
    TimeUnit.MILLISECONDS.sleep(500);
  }

  public void run() {
    try {
      while (true) {
        TimeUnit.MILLISECONDS.sleep(100);
        PrintUtils.print(Thread.currentThread() + " " + this);
      }
    } catch (InterruptedException e) {
      PrintUtils.print("Interrupted");
    }
  }

}
