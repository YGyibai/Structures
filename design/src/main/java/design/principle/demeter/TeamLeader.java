package design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-09-18 15:28
 */
public class TeamLeader {
    public void checkNumberOfCourse(){
        List<Course> courseList=new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程数量是"+courseList.size());
    }
}
