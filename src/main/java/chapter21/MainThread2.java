package chapter21;

import java.lang.Thread.UncaughtExceptionHandler;

public class MainThread2 {

  public static void main(String[] args) throws InterruptedException {
    Thread.currentThread().setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        System.out.println(
            "�쳣catch��,��ǰ�߳�Ϊ��" + Thread.currentThread().getName() + "���쳣�߳�Ϊ��" + t.getName()
                + "���쳣��ϢΪ��" + e.getStackTrace());

        System.err.println("���ԣ�������Ϣ���");
        throw new RuntimeException("final unhandled exception: " + e);
      }
    });

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

}
