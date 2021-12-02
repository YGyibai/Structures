package design.pattern.structure.facade;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-09 16:52
 */
public class  PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+"积分支付成功！");
        return true;
    }
}
