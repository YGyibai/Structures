package design.pattern.structure.composite;

/**
 * @Description: 目录组件
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-16 10:39
 */
public abstract class CatalogComponent {

    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public String getNode(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取目录操作");
    }

    public double getPrice(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
