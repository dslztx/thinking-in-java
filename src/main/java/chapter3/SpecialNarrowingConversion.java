package chapter3;

public class SpecialNarrowingConversion {

  public static void main(String[] args) {
    byte a = 10;

    byte b = 1;
    int c = 1;
    long l = 1L;
    float f = 10.0F;
    double d = 10.0D;

    //以下不必进行显式转换
    a += b;
    a -= c;
    a >>= l;
    a |= l;
    a += f;
    a -= d;

    //以下必须进行显式转换
    a = (byte) (a + l);
    a = (byte) (a - c);
    a = (byte) (a >> l);
    a = (byte) (a | l);
    a = (byte) (a + f);
    a = (byte) (a - d);
  }
}
