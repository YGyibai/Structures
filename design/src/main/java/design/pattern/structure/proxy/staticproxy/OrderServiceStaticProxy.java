package design.pattern.structure.proxy.staticproxy;

import design.pattern.structure.proxy.Order;
import design.pattern.structure.proxy.OrderService;
import design.pattern.structure.proxy.OrderServiceImpl;
import design.pattern.structure.proxy.db.DataSourceContextHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: service静态代理类
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-24 20:16
 */
public class OrderServiceStaticProxy {
    private static final Logger LOGGER= LoggerFactory.getLogger(OrderServiceStaticProxy.class);
    //模拟spring自动注入
    private OrderService orderService;

    public int saveOrder(Order order){
        beforeMethod(order);
        orderService=new OrderServiceImpl();
        afterMethod();
        return orderService.saveOrder(order);
    }

    public void beforeMethod(Order order){
        int userId=order.getUserId();
        int dbRouter=userId %2;
        LOGGER.info("静态代理分配到db【"+dbRouter+"】处理数据");
        //todo 设置DataSource
        DataSourceContextHolder.setDbType(String.valueOf(dbRouter));
    }
    public void afterMethod(){
        LOGGER.info("静态代理after code ");
    }
}
