package design.pattern.creational.abstractfactory;

/**
 * @Description: 课程工厂
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-12 20:47
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
