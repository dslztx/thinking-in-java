package chapter5;

public class DynamicArray {

  public static void main(String[] args) throws InterruptedException {
    Other.main(new String[]{"fiddle", "de", "dum"});
    Thread.sleep(1000);
  }

}

class Other {

  public static void main(String[] args) {
    for (String s : args) {
      System.out.println(s + " ");
    }
  }
}
