package concurrence_21;

public class EvenGenerator extends IntGenerator {

  private int currentEvenValue = 0;

  public static void main(String[] args) {
    EvenChecker.test(new EvenGenerator());
  }

  public int next() throws InterruptedException {
    ++currentEvenValue;
    Thread.sleep(10);
    ++currentEvenValue;
    return currentEvenValue;
  }
}
