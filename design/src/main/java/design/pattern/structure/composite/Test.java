package design.pattern.structure.composite;

/**
 * @Description: 组合模式测试
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-16 14:31
 */
public class Test {

    public static void main(String[] args) {
        CatalogComponent linuxSource=new Course("linux",11);
        CatalogComponent windowSource=new Course("windows",11);

        CatalogComponent javaCatalog=new CourseCatalog("java目录",2);
        CatalogComponent javaSource1=new Course("java1期",44);
        CatalogComponent javaSource2=new Course("java2期",55);
        javaCatalog.add(javaSource1);
        javaCatalog.add(javaSource2);

        CatalogComponent mainCatalog=new CourseCatalog("主目录",1);
        mainCatalog.add(windowSource);
        mainCatalog.add(linuxSource);
        mainCatalog.add(javaCatalog);
        mainCatalog.print();
    }
}
