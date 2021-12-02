package design.pattern.creational.builder;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-23 15:43
 */
public class CourseActualBuilder extends CourseBuilder {
    private Course course=new Course();


    @Override
    public void builderCourseName(String courseName) {
         course.setCourseName(courseName);
    }

    @Override
    public void builderCoursePPT(String coursePPT) {
         course.setCoursePPT(coursePPT);
    }

    @Override
    public void builderCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void builderCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void builderCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return this.course;
    }
}
