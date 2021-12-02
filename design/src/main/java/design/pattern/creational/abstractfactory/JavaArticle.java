package design.pattern.creational.abstractfactory;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-14 10:08
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写java手记");
    }
}
