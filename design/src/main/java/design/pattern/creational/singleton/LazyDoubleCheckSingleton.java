package design.pattern.creational.singleton;

/**
 * 懒汉模式双重检查机制
 *
 * @Description: 懒汉模式双重检查机制
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-26 15:41
 */
public class LazyDoubleCheckSingleton {
    //共享变量
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    //做了三个操作可能发生指令重排序 1.分配内存 2.初始化对象 3.引用指向
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
