package design.pattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-15 10:00
 */
public class EmployeeFactory {
    private static final Map<String,Employee> EMPLOYEE_MAP=new HashMap<>();

    public static Employee getManager(String department){
        Manager manager= (Manager) EMPLOYEE_MAP.get(department);
        if (manager==null){
            manager =new Manager(department);
            System.out.println("创建部门经理"+department);
            String reportContent=department+",此次报告内容是：......";
            manager.setReportContent(reportContent);
            System.out.println("创建报告，"+department);
            EMPLOYEE_MAP.put(department,manager);
        }
        return  manager;
    }


}
