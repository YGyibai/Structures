package design.pattern.creational.factorymethod;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-09-24 16:45
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory factory=new JavaVideoFactory();
        Video video=factory.getVideo();
        video.produce();
    }
}
