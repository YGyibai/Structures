package design.pattern.structure.composite;


import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 课程目录
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-16 11:37
 */
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items=new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level=level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }


    @Override
    public String getNode(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent item : items) {
            if (this.level!=null){
                for (int i = 0; i <level ; i++) {
                    System.out.print("    ");
                }
            }
            item.print();
        }
    }
}
