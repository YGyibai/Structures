package design.pattern.structure.bridge;

/**
 * @Description: 手机品牌A
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-18 15:13
 */
public class HandsetBrandA  extends HandsetBrand{

    public HandsetBrandA(HandsetSoft soft) {
        super(soft);
    }

    @Override
    public void run() {
        soft.run();
    }
}
