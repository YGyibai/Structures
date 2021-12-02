package design.pattern.creational.singleton;

/**
 * @Description: 线程测试
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-25 15:00
 */
public class T implements Runnable{

    @Override
    public void run() {
        //第一种解决方式
        LazySingleton lazySingleton=LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"\t"+lazySingleton);
        //第二种解决方式
        StaticInnerClassSingleton innerClassSingleton=StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"\t"+innerClassSingleton);
    }
}
