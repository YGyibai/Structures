package stream;

import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * java8新特性
 *
 * @Description: java8新特性
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-08-02 16:46
 */
public class StreamDemo {
    public static void main(String[] args) {
        String[] strings = {"A", "ABC", "DEFGH"};
        int number = Arrays.stream(strings)
                .filter(s -> s.startsWith("A"))
                .mapToInt(String::length)
                .max().getAsInt();
        System.out.println(number);

        String str=Arrays.stream(strings).reduce((s1,s2)->s1.length()>s2.length()?s1:s2).get();
        System.out.println(str);


        LinkedList<Object> collection=new LinkedList<>();
        if (collection.isEmpty()) {
            System.out.println("collection is empty");
        }
        collection=null;
        /**
         * 检测集合是否为null或者为空 建议用CollectionUtils.isEmpty
         * 源码：collection == null || collection.isEmpty()
         */
        if (CollectionUtils.isEmpty(collection)){
            System.out.println("collection is null");
        }
    }
}
