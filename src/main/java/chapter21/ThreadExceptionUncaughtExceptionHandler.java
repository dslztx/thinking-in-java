package chapter21;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadExceptionUncaughtExceptionHandler {

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
              //û��ץסRuntimeException�쳣
              e.printStackTrace();
            }

            System.out.println("can not run here");

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
              "�쳣catch��,��ǰ�߳�Ϊ��" + Thread.currentThread().getName() + "���쳣�߳�Ϊ��" + t.getName()
                  + "���쳣��ϢΪ��" + e.getStackTrace());
        }
      });

      thread.start();
    } catch (RuntimeException e) {
      //�߳��ڲ��쳣���ܱ������̴߳���
      e.printStackTrace();
    }

    Thread.sleep(100);

    //û��ץס�쳣���߳�ֱ�ӽ���
    System.out.println("thread is alive ? " + thread.isAlive());
  }
}