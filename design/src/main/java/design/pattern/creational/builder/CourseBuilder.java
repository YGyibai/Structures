package design.pattern.creational.builder;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-23 15:33
 */
public abstract class CourseBuilder {

    public abstract void builderCourseName(String courseName);
    public abstract void builderCoursePPT(String coursePPT);
    public abstract void builderCourseVideo(String courseVideo);
    public abstract void builderCourseArticle(String courseArticle);
    public abstract void builderCourseQA(String courseQA);

    public abstract Course makeCourse();
}
