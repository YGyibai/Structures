package design.pattern.creational.simplefactory;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-09-24 16:03
 */
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制java");
    }
}
