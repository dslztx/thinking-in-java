package concurrence_21.waxomatic2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Car {

  private Lock lock = new ReentrantLock();
  private Condition condition = lock.newCondition();
  private boolean waxOn = false;

  public void waxed() {
    lock.lock();
    try {
      waxOn = true;
      condition.signalAll();
    } finally {
      lock.unlock();
    }
  }

  public void buffed() {
    lock.lock();
    try {
      waxOn = false;
      condition.signalAll();
    } finally {
      lock.unlock();
    }
  }

  public void waitForWaxing() {
    lock.lock();
    try {
      while (waxOn == false) {
        condition.await();
      }
    } finally {
      lock.unlock();
    }
  }

  public void waitForBuffing() {
    lock.lock();
    try {
      while (waxOn == true) {
        condition.await();
      }
    } finally {
      lock.unlock();
    }
  }
}

class WaxOn implements Runnable {

  private Car car;

  public WaxOn(Car c) {
    car = c;
  }

  public void run() {
    try {

    } catch (InterruptedException e) {
      System.out.println("Exiting via interrupt");
    }
    System.out.println("Ending Wax On task");
  }
}

public class WaxOMatic2 {

}
