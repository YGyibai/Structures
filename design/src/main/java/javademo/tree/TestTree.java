package javademo.tree;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 测试类
 *
 * @Description: 测试类
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-06 14:11
 */
public class TestTree {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestTree.class);

    //    递归查询子节点
    public static List<Menu> getChildes(Menu root, List<Menu> all) {
        List<Menu> children = all.stream()
                .filter(menu -> {
                    return Objects.equals(menu.getParentId(), root.getId());
                })
                .map(menu -> {
                    menu.setMenuList(getChildes(menu, all));
                    return menu;
                })
                .collect(Collectors.toList());
        return children;
    }

    public static void main(String[] args) {
        //模拟从数据库中取出的值
        List<Menu> menus = Arrays.asList(
                new Menu(1, "根节点", 0),
                new Menu(2, "子节点1", 1),
                new Menu(3, "子节点1.1", 2),
                new Menu(4, "子节点1.2", 2),
                new Menu(5, "子节点1.3", 2),
                new Menu(6, "子节点2", 1),
                new Menu(7, "子节点2.1", 6),
                new Menu(8, "子节点2.2", 6),
                new Menu(9, "子节点2.2.1", 7),
                new Menu(10, "子节点2.2.2", 7),
                new Menu(11, "子节点3", 1),
                new Menu(12, "子节点3.1", 11)
        );

        //获取树形数据
        List<Menu> collect = menus.stream()
                .filter(menu -> menu.getParentId() == 0) //获取根节点
                .map(menu -> {
                    menu.setMenuList(getChildes(menu, menus));
                    return menu;
                })
                .collect(Collectors.toList());
        LOGGER.warn("获取父节点");
        LOGGER.info(JSON.toJSONString(collect));
    }
}
