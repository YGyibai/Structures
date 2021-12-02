package design.pattern.structure.adapter.objectadapter;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: 测试类
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-12 15:03
 */
public class Test {


    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target target1 = new Adapter();
        target1.request();
    }

}
