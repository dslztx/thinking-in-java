package concurrence_21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecker implements Runnable {

  private final int id;
  private IntGenerator generator;

  public EvenChecker(IntGenerator g, int ident) {
    generator = g;
    id = ident;
  }

  public static void test(IntGenerator gp, int count) {
    System.out.println("Press Control-C to exit");
    ExecutorService exec = Executors.newCachedThreadPool();
    for (int i = 0; i < count; i++) {
      exec.execute(new EvenChecker(gp, i));
    }
    exec.shutdown();
  }

  public static void test(IntGenerator gp) {
    test(gp, 10);
  }

  public void run() {
    while (!generator.isCanceled()) {
      int val = 0;
      try {
        val = generator.next();
      } catch (InterruptedException e) {
        System.err.println(e);
      }
      if (val % 2 != 0) {
        System.out.println(val + " not even!");
        generator.cancel();
      }
    }
  }

}
