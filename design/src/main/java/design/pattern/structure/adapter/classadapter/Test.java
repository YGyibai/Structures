package design.pattern.structure.adapter.classadapter;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-12 15:01
 */
public class Test {
    public static void main(String[] args) {
        Target target=new ConcreteTarget();
        target.request();

        Target target1=new Adapter();
        target1.request();
    }
}
