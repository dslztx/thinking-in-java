package concurrence_21;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicEvenGenerator extends IntGenerator {

  private AtomicInteger currentEvenValue = new AtomicInteger(0);

  public static void main(String[] args) {
    EvenChecker.test(new AtomicEvenGenerator());
  }

  public int next() throws InterruptedException {
    return currentEvenValue.addAndGet(2);
  }
}
