package design.pattern.structure.adapter.objectadapter;


/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-11 17:42
 */
public class Adapter implements Target {

    Adaptee adaptee=new Adaptee();

    @Override
    public void request() {
        adaptee.adapterRequest();
    }
}
