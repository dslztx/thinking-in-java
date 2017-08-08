package concurrence_21;

public class SynchronizedEvenGenerator extends IntGenerator {

  private int currentEvenValue = 0;

  public static void main(String[] args) {
    EvenChecker.test(new SynchronizedEvenGenerator());
  }

  public synchronized int next() throws InterruptedException {
    ++currentEvenValue;
    Thread.sleep(10);
    ++currentEvenValue;
    return currentEvenValue;
  }
}
