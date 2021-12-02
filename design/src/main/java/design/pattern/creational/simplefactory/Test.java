package design.pattern.creational.simplefactory;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-09-24 16:45
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory factory=new VideoFactory();
        Video video=factory.getVideo(JavaVideo.class);
        video.produce();
    }
}
