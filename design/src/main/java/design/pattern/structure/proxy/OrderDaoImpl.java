package design.pattern.structure.proxy;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-24 20:02
 */
public class OrderDaoImpl implements OrderDao {
    @Override
    public int insertOrder(Order order) {
        System.out.println("添加order成功");
        return 1;
    }
}
