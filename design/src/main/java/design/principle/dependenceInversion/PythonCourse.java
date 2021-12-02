package design.principle.dependenceInversion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-09-17 11:17
 */
public class PythonCourse implements Course{
    private  static final Logger LOGGER= LoggerFactory.getLogger(PythonCourse.class);
    @Override
    public void studyCourse() {
        LOGGER.info("Geely 在学习python");
    }
}
