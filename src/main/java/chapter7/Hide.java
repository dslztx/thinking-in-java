package chapter7;

import chapter0.PrintUtils;

class Homer {

  char doh(char c) {
    PrintUtils.print("doh(char)");
    return 'd';
  }

  float doh(float f) {
    PrintUtils.print("doh(float)");
    return 1.0f;
  }

}

class Milhouse {

}

class Bart extends Homer {

  void doh(Milhouse m) {
    PrintUtils.print("doh(Milhouse)");
  }
}

//class Lisa extends Homer {
//
//  @Override
//  void doh(Milhouse m) {
//    System.out.println("doh(Milhouse)");
//  }
//}

public class Hide {

  public static void main(String[] args) {
    Bart b = new Bart();
    b.doh(1);
    b.doh('x');
    b.doh(1.0f);
    b.doh(new Milhouse());
  }

}
