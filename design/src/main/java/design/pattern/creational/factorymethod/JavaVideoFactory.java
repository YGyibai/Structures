package design.pattern.creational.factorymethod;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-09-28 19:46
 */
public class JavaVideoFactory  extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
