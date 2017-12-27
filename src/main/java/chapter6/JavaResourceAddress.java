package chapter6;

//“JavaResourceAddress”这个Java资源（类）的地址为“chapter6.JavaResourceAddress”
public class JavaResourceAddress extends JavaResourceAddressParent {

  //“b”这个Java资源（原生类成员）的地址为“chapter6.JavaResourceAddress”
  static int b;

  //“a”这个Java资源（原生类成员）的地址为“chapter6.JavaResourceAddress”
  int a;

  //“g()”这个Java资源（原生类成员）的地址为“chapter6.JavaResourceAddress”
  static void g() {
  }

  //“f()”这个Java资源（原生类成员）的地址为“chapter6.JavaResourceAddress”
  void f() {
  }

  //“c”这个Java资源（复制类成员）的地址为“chapter6.JavaResourceAddress”

  //“h()”这个Java资源（复制类成员）的地址为“chapter6.JavaResourceAddress”

}

class JavaResourceAddressParent {

  int c;

  void h() {

  }
}