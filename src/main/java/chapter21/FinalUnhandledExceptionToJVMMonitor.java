package chapter21;

import java.lang.Thread.UncaughtExceptionHandler;

public class FinalUnhandledExceptionToJVMMonitor {

  public static void main(String[] args) throws InterruptedException {
    Thread thread = null;
    try {
      thread = new Thread(new Runnable() {
        @Override
        public void run() {
          while (true) {
            try {
              System.out.println("hello world");
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
      }, "dslztx-thread-1");

      thread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
          System.out.println(
              "异常catch了,当前线程为：" + Thread.currentThread().getName() + "，异常线程为：" + t.getName()
                  + "，异常信息为：" + e.getStackTrace());

          System.err.println("测试，错误信息输出");
          throw new RuntimeException("final unhandled exception: " + e);
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
