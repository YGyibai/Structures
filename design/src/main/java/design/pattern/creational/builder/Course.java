package design.pattern.creational.builder;

import java.util.StringJoiner;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-23 15:06
 */
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    //question and  answer
    private String courseQA;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Course.class.getSimpleName() + "[", "]")
                .add("courseName='" + courseName + "'")
                .add("coursePPT='" + coursePPT + "'")
                .add("courseVideo='" + courseVideo + "'")
                .add("courseArticle='" + courseArticle + "'")
                .add("courseAQ='" + courseQA + "'")
                .toString();
    }
}
