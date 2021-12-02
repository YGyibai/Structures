package design.pattern.creational.builder;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-23 16:02
 */
public class Test {
    public static void main(String[] args) {
        CourseActualBuilder courseActualBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseActualBuilder);

        Course course = coach.makeCourse("java", "javaPPT",
                "javaVideo", "java手记", "javaQA");
        System.out.println(course);
        Set<String> set= ImmutableSet.<String>builder().add("a").add("b").build();
        System.out.println(set);
    }
}
