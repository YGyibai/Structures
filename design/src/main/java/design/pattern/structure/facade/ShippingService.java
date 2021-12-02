package design.pattern.structure.facade;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-09 16:55
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+"进入物流系统");
        String appNo="6666";
        return appNo;
    }
}
