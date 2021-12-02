package design.pattern.structure.flyweight;

/**
 * @Description: 经理
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-15 09:54
 */
public class Manager implements Employee {
    @Override
    public void report() {
        System.out.println(this.reportContent);
    }
    //部门
    private String department;
    //报告内容
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
