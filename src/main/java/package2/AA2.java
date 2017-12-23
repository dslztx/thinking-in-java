package package2;
import package1.A;
/**
 * 不同包子类（注释掉的资源表示不能被访问）
 *
 * @author dsl
 */
public class AA2 extends A {
  public static void main(String[] args) {
    //创建自身实例，进行访问
    AA2 aa2 = new AA2();
    //“aa2.a”软资源不存在
    //System.out.println(aa2.a);
    //“aa2.b”软资源不存在
    //System.out.println(aa2.b);
    System.out.println(aa2.c);
    System.out.println(aa2.d);
  }
}