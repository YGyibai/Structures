package design.pattern.creational.singleton;

/**
 * @Description: threadLocal单例
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-03 10:18
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton
            = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };
    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingleton.get();
    }
}
