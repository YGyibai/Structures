package design.pattern.structure.facade;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:  外观模式
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-09 17:42
 */
public class Test {
    @Autowired
    private GiftExchangeService service;

    public  void main(String[] args) {
        PointsGift pointsGift=new PointsGift("T");
        service.getExchange(pointsGift);
    }

}
