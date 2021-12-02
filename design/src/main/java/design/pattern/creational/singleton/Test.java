package design.pattern.creational.singleton;

/**
 * 单例模式测试
 *
 * @Description: 单例模式测试
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-25 14:43
 */
public class Test {
    public static void main(String[] args) {
        /** 懒汉和饿汉模式测试
             Thread thread1=new Thread(new T());
             Thread thread2=new Thread(new T());
             thread1.start();
             thread2.start();
             System.out.println("lazy end");
         **/

        EnumInstance enumInstance=EnumInstance.INSTANCE;
        System.out.println(enumInstance.getData());
    }
}
