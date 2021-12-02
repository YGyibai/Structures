package design.pattern.structure.adapter.objectadapter;

import design.pattern.structure.adapter.objectadapter.Target;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-11 17:39
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
