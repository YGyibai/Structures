package design.pattern.structure.composite;

/**
 * @Description: 课程
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-16 11:13
 */
public class Course extends CatalogComponent{

    private String name;
    private double price;


    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getNode(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Name："+this.name+"Price："+price );
    }
}
