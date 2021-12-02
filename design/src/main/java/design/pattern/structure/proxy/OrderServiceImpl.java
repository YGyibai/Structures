package design.pattern.structure.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-24 20:05
 */
public class OrderServiceImpl implements OrderService{
    private static final Logger LOGGER= LoggerFactory.getLogger(OrderServiceImpl.class);
    private OrderDao orderDao;
    @Override
    public int saveOrder(Order order) {
        //spring 会自己注入，这里直接new
        orderDao=new OrderDaoImpl();
        LOGGER.info("service层调用dao层添加order");
        return orderDao.insertOrder(order);
    }
}
