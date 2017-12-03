/**
 * 调用Main类的静态方法，使得“加载Main类文件，创建类对象实例（引发静态数据成员的默认初始化）”，接着触发静态数据成员初始化中的“定义初始化和静态数据成员初始化语句”<br/>
 * 1)分配完类对象实例的内存之后，首先进行静态数据成员的默认初始化（静态数据成员a,b,c被默认初始化为0值）<br/>
 * 2)接下来由于触发，进行静态数据成员的“定义初始化，静态数据成员初始化语句”。按照静态数据成员的定义顺序，依次进行静态数据成员的定义初始化，有些静态数据成员也可能没有定义初始化（a没有定义初始化;b有定义初始化被初始化为10，这同时<br/>
 * 说明此时c还未被定义初始化，还只是默认初始化得到的0值;c有定义初始化，被初始化为20<br/>
 * 3)执行静态数据成员初始化语句，有可能没有静态数据成员初始化语句（a被赋值为10,c被赋值为30)<br/>
 *
 * <br/>
 * 创建Main类实例<br/>
 * 1)分配完类实例的内存之后，首先进行非静态数据成员的默认初始化（非静态数据成员d,f,g被默认初始化为0值）<br/>
 * 2)按照非静态数据成员的定义顺序，依次进行非静态数据成员的定义初始化，有些非静态数据成员也可能没有定义初始化（d没有定义初始化;f有定义初始化被初始化为10，这同时<br/>
 * 说明此时g还未被定义初始化，还只是默认初始化得到的0值;g有定义初始化，被初始化为20<br/>
 * 3)执行非静态数据成员初始化语句，有可能没有非静态数据成员初始化语句（d被赋值为10,g被赋值为40)<br/>
 * 4)执行构造方法语句（d被赋值为20，g被赋值为30)<br/>
 *
 */
public class Main {
  static int a;

  static int b = f();

  static int c = 20;

  static int f() {
    return c + 10;
  }

  static {
    System.out.println("static initialize start");
    System.out.println(a);
    System.out.println(c);

    a = 10;
    c = 30;

    System.out.println(a);
    System.out.println(c);
    System.out.println("static initialize end");
  }


  int d;

  int f = h();

  int g = 20;


  int h() {
    return g + 10;
  }

  {
    System.out.println("initialize start");
    System.out.println(d);
    System.out.println(g);

    d = 10;
    g = 40;

    System.out.println(d);
    System.out.println(g);
    System.out.println("initialize end");
  }



  public Main() {
    d = 20;
    g = 30;

    System.out.println("constructor print start");
    System.out.println(d);
    System.out.println(g);
    System.out.println("constructor print end");
  }

  /**
   * 调用Main类的静态方法，使得“加载Main类文件，创建类对象实例（引发静态数据成员的默认初始化）”，接着触发静态数据成员初始化中的“定义初始化和静态数据成员初始化语句” 　　
   */
  public static void main(String[] args) throws ClassNotFoundException {
    System.out.println(Main.a);
    System.out.println(Main.b);
    System.out.println(Main.c);

    System.out.println("分割线-------------");

    // 创建Main类的类实例
    Main main = new Main();
    System.out.println(main.d);
    System.out.println(main.f);
    System.out.println(main.g);
  }
}