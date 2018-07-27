package chapter21;

public class ThreadExceptionSelfCatch {

  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        while (true) {
          try {
            System.out.println("hello world");
            throw new RuntimeException("hello world exception");
          } catch (Exception e) {
            e.printStackTrace();
          }

          System.out.println("run successfully");

          try {
            Thread.sleep(10000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    });

    thread.start();

    Thread.sleep(100);

    //内部抓住异常，线程保持运行
    System.out.println("thread is alive ? " + thread.isAlive());
  }
}
