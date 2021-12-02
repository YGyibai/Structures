package design.pattern.structure.bridge;

/**
 * @Description: 桥接模式测试
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-18 15:21
 */
public class Test {
    public static void main(String[] args) {
        HandsetBrand handsetBrand=new HandsetBrandA(new HandsetEmail());
        handsetBrand.run();
        handsetBrand=new HandsetBrandA(new HandsetGame());
        handsetBrand.run();
    }
}
