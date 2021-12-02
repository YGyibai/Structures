package javademo.partition;

import cn.hutool.core.collection.ListUtil;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.ListUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: 集合切片方案
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-11-10 10:40
 */
public class PartitionExample {
    // 原集合
    private static final List<String> OLD_LIST = Arrays.asList(
            "唐僧,悟空,八戒,沙僧,曹操,刘备,孙权".split(","));

    private static final Logger LOGGER = LoggerFactory.getLogger(PartitionExample.class);

    /**
     * hutool集合分片
     * @param list
     */
    public static void hutoolDemo(List list) {
        List<List<String>> lists = ListUtil.partition(list, 3);
        LOGGER.info("hutool工具类");
        lists.forEach(l -> {
            System.out.println(l.size());
        });
    }

    /**
     * commons 框架分片
     * @param list
     */
    public static void commonDemo(List list) {
        LOGGER.info("commons lang l工具类");
        List<List<String>> lists = ListUtils.partition(list, 3);
        lists.forEach(l -> {
            System.out.println(l.size());
        });
    }

    public static void guavaDemo(List list) {
        LOGGER.info("Guava 工具类");
        List<List<String>> lists = Lists.partition(list, 3);
        lists.forEach(l -> {
            System.out.println(l.size());
        });
    }

    public static void main(String[] args) {
        hutoolDemo(OLD_LIST);
        commonDemo(OLD_LIST);
        guavaDemo(OLD_LIST);
    }
}
