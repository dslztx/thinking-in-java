package package3;
import package2.AA2;
/**
 * 跨了两层包的孙类（注释掉的资源表示不能被访问）
 *
 * @author dsl
 */
public class AAA extends AA2 {
  public static void main(String[] args) {
    //创建自身实例，进行访问
    AAA aaa = new AAA();
    //“aaa.a”软资源不存在
    //System.out.println(aaa.a);
    //“aaa.b”软资源不存在
    //System.out.println(aaa.b);
    System.out.println(aaa.c);
    System.out.println(aaa.d);
  }
}