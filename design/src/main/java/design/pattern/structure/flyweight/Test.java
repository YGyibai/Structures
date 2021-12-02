package design.pattern.structure.flyweight;

/**
 * @Description: 享元模式测试
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-15 14:56
 */
public class Test {
    private static final String[] departments={"RD","QA","PM","BD"};

    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            String department=departments[(int)(Math.random()*departments.length)];
            Manager manager= (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
