package design.principle.openclose;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试类
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-09-16 19:38
 */
public class Test {
    private  static final Logger LOGGER= LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {
        Course javaCourse=new JavaDiscountCourse(96,"java",348d);
        LOGGER.info(javaCourse.toString());
    }
}
