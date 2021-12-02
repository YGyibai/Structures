package javademo.tree;

import lombok.Data;

import java.util.List;

/**
 * @Description: 实体类
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-06 14:08
 */
@Data
public class Menu {
    public Integer id;
    private String name;
    private Integer parentId;
    private List<Menu> menuList;

    public Menu(Integer id, String name, Integer parentId, List<Menu> menuList) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.menuList = menuList;
    }

    public Menu(Integer id, String name, Integer parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }
}
