package design.pattern.structure.proxy.dynamicproxy;

import design.pattern.structure.proxy.Order;
import design.pattern.structure.proxy.db.DataSourceContextHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: 动态代理
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-26 20:13
 */
public class OrderDynamicProxy implements InvocationHandler {
    private static final Logger LOGGER= LoggerFactory.getLogger(OrderDynamicProxy.class);

    private Object target;

    public OrderDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class targetClass=target.getClass();
        /**
         * loader：一个classloader对象，定义了由哪个classloader对象对生成的代理类进行加载
         * interfaces：一个interface对象数组，表示我们将要给我们的代理对象提供一组什么样的接口，
         *             如果我们提供了这样一个接口对象数组，那么也就是声明了代理类实现了这些接口，代理类就可以调用接口中声明的所有方法。
         * h：一个InvocationHandler对象，表示的是当动态代理对象调用方法的时候会关联到哪一个InvocationHandler对象上，并最终由其调用。
         */
        return Proxy.newProxyInstance(targetClass.getClassLoader(),targetClass.getInterfaces(),this);
    }

    /**
     * @param proxy  代理类代理的真实对象
     * @param method  要被增强的方法对象
     * @param args 具体的方法的残守
     * @return
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject=args[0];
        beforeMethod(argObject);
        Object obj=method.invoke(target,args);
        afterMethod();
        return obj;
    }

    public void beforeMethod(Object obj){
        int userId=0;
        if (obj instanceof Order){
            Order order=(Order)obj;
            userId=order.getUserId();
        }
        int dbRouter=userId %2;
        LOGGER.info("动态代理分配到db【"+dbRouter+"】处理数据");
        //todo 设置DataSource
        DataSourceContextHolder.setDbType(String.valueOf(dbRouter));
    }
    public void afterMethod(){
        LOGGER.info("动态代理after code ");
    }
}
