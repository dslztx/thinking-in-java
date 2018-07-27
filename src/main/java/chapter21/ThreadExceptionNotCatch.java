package chapter21;

public class ThreadExceptionNotCatch {

  public static void main(String[] args) throws InterruptedException {
    Thread thread = null;
    try {
      thread = new Thread(new Runnable() {
        @Override
        public void run() {
          while (true) {
            try {
              System.out.println("hello world");

              //以下抛出异常内部未能处理，执行Thread类的“private void dispatchUncaughtException(Throwable e)”方法，该异常作为参数传入
              throw new RuntimeException("hello world exception");
            } catch (NullPointerException e) {
              //没有抓住RuntimeException异常
              e.printStackTrace();
            }

            System.out.println("can not run to here");

            try {
              Thread.sleep(10000);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
          }
        }
      });

      thread.start();
    } catch (RuntimeException e) {
      //线程内部异常不能被其它线程处理
      e.printStackTrace();
    }

    Thread.sleep(100);

    //没有抓住异常，线程直接结束
    System.out.println("thread is alive ? " + thread.isAlive());
  }
}