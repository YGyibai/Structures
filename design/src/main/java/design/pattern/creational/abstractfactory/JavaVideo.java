package design.pattern.creational.abstractfactory;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-14 10:02
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("java视频");
    }
}
