package design.pattern.structure.adapter.classadapter;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-11 17:42
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapterRequest();
    }
}
