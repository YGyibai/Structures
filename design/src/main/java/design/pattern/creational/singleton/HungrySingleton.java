package design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @Description: 饿汉式
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-27 14:45
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton;
    static{
        hungrySingleton=new HungrySingleton();
    }
    private HungrySingleton(){}
    public HungrySingleton getInstance(){
        return hungrySingleton;
    }
    public Object readResolve(){
        return hungrySingleton;
    }
}
