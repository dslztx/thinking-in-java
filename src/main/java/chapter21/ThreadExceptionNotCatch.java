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

              //�����׳��쳣�ڲ�δ�ܴ���ִ��Thread��ġ�private void dispatchUncaughtException(Throwable e)�����������쳣��Ϊ��������
              throw new RuntimeException("hello world exception");
            } catch (NullPointerException e) {
              //û��ץסRuntimeException�쳣
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
      //�߳��ڲ��쳣���ܱ������̴߳���
      e.printStackTrace();
    }

    Thread.sleep(100);

    //û��ץס�쳣���߳�ֱ�ӽ���
    System.out.println("thread is alive ? " + thread.isAlive());
  }
}