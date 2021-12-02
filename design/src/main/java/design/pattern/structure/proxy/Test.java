package design.pattern.structure.proxy;

import design.pattern.structure.proxy.staticproxy.OrderServiceStaticProxy;

/**
 * @Description: 代理模式测试
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-24 22:11
 */
public class Test {
    public static void main(String[] args) {
        Order order=new Order();
        order.setUserId(1);

        OrderServiceStaticProxy proxy=new OrderServiceStaticProxy();
        proxy.saveOrder(order);
    }
}
