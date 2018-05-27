package chapter20;

import chapter0.OSExecute;
import java.util.HashSet;

public class HashSetTest {

  HashSet<String> testObject = new HashSet<String>();


  @Test
  void _contains() {
    testObject.add("one");
    assert testObject.contains("one");
  }

  @Test
  void _remove() {
    testObject.add("one");
    testObject.remove("one");
    assert testObject.isEmpty();
  }

  public static void main(String[] args) {
    OSExecute.command("java net.mindview.atunit.AtUnit HashSetTest");
  }
}
