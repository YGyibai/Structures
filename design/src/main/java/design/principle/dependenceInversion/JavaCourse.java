package design.principle.dependenceInversion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-09-17 10:57
 */
public class JavaCourse implements Course{
    private  static final Logger LOGGER= LoggerFactory.getLogger(JavaCourse.class);
    @Override
    public void studyCourse() {
        LOGGER.info("Geely 在学习java");
    }
}
