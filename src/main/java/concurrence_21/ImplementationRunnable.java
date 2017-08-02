package concurrence_21;

class ComputeTask implements Runnable {

  public void run() {
    int sum = 0;
    for (int i = 0; i < 100; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
}

public class ImplementationRunnable {

  public static void main(String[] args) {
    Thread thread = new Thread(new ComputeTask());
    thread.start();
  }

}
