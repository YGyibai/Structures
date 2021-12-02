package design.principle.dependenceInversion;

/**
 * 测试 依赖倒置原则例子
 *
 * @Description: 测试
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-09-17 10:40
 */
public class Test {

    public static void main(String[] args) {
        // v1
//        Geely geely=new Geely();
//        geely.studyJavaCourse();
//        geely.studyPythonCourse();

        // v2 接口方法实现
//        Geely geely=new Geely();
//        geely.studyCourse(new JavaCourse());
//        geely.studyCourse(new PythonCourse());

        // v3 构造器注入实现
//        Geely geely=new Geely(new JavaCourse());
//        geely.studyCourse();
//        geely=new Geely(new PythonCourse());
//        geely.studyCourse();

        //v4 set注入实现
        Geely geely=new Geely();
        geely.setCourse(new JavaCourse());
        geely.studyCourse();
        geely.setCourse(new PythonCourse());
        geely.studyCourse();
    }
}
