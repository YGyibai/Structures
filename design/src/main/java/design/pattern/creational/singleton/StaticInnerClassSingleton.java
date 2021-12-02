package design.pattern.creational.singleton;

/**
 * @Description:  基于初始化的延迟加载
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-26 17:19
 */
public class StaticInnerClassSingleton {
    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton=new StaticInnerClassSingleton();
    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
    private StaticInnerClassSingleton(){}
}
