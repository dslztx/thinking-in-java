package chapter0;

import java.util.ArrayList;
import java.util.List;

public class PrintUtils {

  public static void print(String a) {
    System.out.println(a);
  }

  public static void print(boolean a) {
    System.out.println(a);
  }

  public static void print(int a) {
    System.out.println(a);
  }

  public static List<Integer> range(int start, int end, int step) {
    List<Integer> list = new ArrayList<Integer>();
    for (int i = start; i < end; i += step) {
      list.add(i);
    }
    return list;
  }

  public static List<Integer> range(int start, int end) {
    List<Integer> list = new ArrayList<Integer>();
    for (int i = start; i < end; i++) {
      list.add(i);
    }
    return list;
  }

  public static List<Integer> range(int end) {
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < end; i++) {
      list.add(i);
    }
    return list;
  }
}
