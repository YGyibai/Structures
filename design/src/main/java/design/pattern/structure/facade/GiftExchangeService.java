package design.pattern.structure.facade;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-09 17:02
 */
public class GiftExchangeService {
    @Autowired
    private PointsPaymentService pointsPaymentService;
    @Autowired
    private QualifyService qualifyService;
    @Autowired
    private ShippingService shippingService;


    public void getExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)){
            //资格验证通过
            if (pointsPaymentService.pay(pointsGift)){
                //支付积分成功
                String appNo=shippingService.shipGift(pointsGift);
                System.out.println("下单成功，订单是"+appNo);
            }
        }
    }

}
