package design.principle.dependenceInversion;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-09-17 10:30
 */
public class Geely {
    private Course course;

    public Geely() {
    }

    public void studyCourse(Course course){
        course.studyCourse();
    }

    public void studyCourse(){
        course.studyCourse();
    }

    public Geely(Course course){
        this.course=course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
