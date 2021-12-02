package design.pattern.structure.facade;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-09 16:50
 */
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName());
        return true;
    }
}
