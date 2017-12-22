package package1;

/**
 * 同包子类（注释掉的资源表示不能被访问）
 *
 * @author dsl
 */
public class AA1 extends A {

  public static void main(String[] args) {
    //创建自身实例，进行访问
    AA1 aa1 = new AA1();
    //System.out.println(aa1.a);
    System.out.println(aa1.b);
    System.out.println(aa1.c);
    System.out.println(aa1.d);
  }
}
