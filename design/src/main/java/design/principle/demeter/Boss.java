package design.principle.demeter;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-09-18 15:26
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){

        teamLeader.checkNumberOfCourse();
    }
}
