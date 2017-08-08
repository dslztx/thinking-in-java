package concurrence_21;

public abstract class IntGenerator {

  private volatile boolean canceled = false;

  public abstract int next() throws InterruptedException;

  public void cancel() {
    canceled = true;
  }

  public boolean isCanceled() {
    return canceled;
  }

}
