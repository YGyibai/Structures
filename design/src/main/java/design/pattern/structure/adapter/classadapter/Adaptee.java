package design.pattern.structure.adapter.classadapter;

/**
 * @Description: 被适配者
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-11 17:16
 */
public class Adaptee {

    public void adapterRequest(){
        System.out.println("被适配者的方法");
    }
}
