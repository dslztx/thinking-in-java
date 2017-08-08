package concurrence_21;

public class SynchronizationExample {

  /**
   * equals to "synchronized (SynchronizationExample.class) {}"
   */
  public static synchronized void staticMethod() {

  }

  /**
   * equals to "synchronized (this) {}"
   */
  public synchronized void nonStaticMethod() {

  }

  public void synchronizationMethod() {
    synchronized (SynchronizationExample.class) {

    }

    synchronized (this) {

    }
  }
}
