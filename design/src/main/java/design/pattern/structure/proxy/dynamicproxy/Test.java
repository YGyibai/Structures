package design.pattern.structure.proxy.dynamicproxy;

import design.pattern.structure.proxy.Order;
import design.pattern.structure.proxy.OrderService;
import design.pattern.structure.proxy.OrderServiceImpl;

/**
 * @Description: 动态代理测试
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-30 20:17
 */
public class Test {
    public static void main(String[] args) {
        Order order=new Order();
        order.setUserId(1);
        OrderService dynamicProxy= (OrderService) new OrderDynamicProxy(new OrderServiceImpl()).bind();
        dynamicProxy.saveOrder(order);
    }
}
