package design.pattern.structure.bridge;

/**
 * @Description: 手机品牌抽象类
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-18 15:04
 */
public abstract class HandsetBrand {

    protected HandsetSoft soft;

    //设置手机软件
    public HandsetBrand(HandsetSoft soft){
        this.soft=soft;
    }

    public abstract void run();
}
