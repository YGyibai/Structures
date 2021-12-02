package design.pattern.creational.singleton;

/**
 * 懒汉（单例模式）
 * @Description: 懒汉（单例模式）
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-25 14:37
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null)
            lazySingleton = new LazySingleton();
        return lazySingleton;
    }
}
