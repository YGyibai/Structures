package design.pattern.creational.abstractfactory;

/**
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-10-14 10:24
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("python 手记");
    }
}
