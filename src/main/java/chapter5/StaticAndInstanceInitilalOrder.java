package chapter5;

class C {

  static int b = 10;
}

class D {

  static int b = 10;

  int a = 10;

  public D() {
    a = 20;
  }
}

public class StaticAndInstanceInitilalOrder {

  public static void main(String[] args) {
    //访问类C的静态数据字段，加载类C的Class文件，引发静态初始化；没有创建类C的实例对象，未引发实例初始化
    System.out.println(C.b);

    //访问类D的构造方法，加载类D的Class文件，引发静态初始化；创建类D的实例对象，引发实例初始化
    D d = new D();
  }
}
