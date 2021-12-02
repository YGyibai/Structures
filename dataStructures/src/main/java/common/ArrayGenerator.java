package common;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 测试用例生成
 *
 * @Description: 测试用例生成
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-07-17 09:35
 */
public class ArrayGenerator {
    private ArrayGenerator(){}

    /**
     * 生成number数量的排序数组
     * @param number 生成数组的数量
     * @return
     */
    public static Integer[] generatorArrayOrder(int number){
        Integer[] data=new Integer[number];
        for (int i = 0; i < data.length; i++) {
            data[i]=i;
        }
        return data;
    }

    /**
     * 选择排序测试生成用例
     * @param number
     * @param bound
     * @return
     */
    public static Integer[] generatorRandomArray(int number,int bound){
        Random random=new Random();
        Integer[] data=new Integer[number];
        for (int i = 0; i < data.length; i++) {
            data[i]=random.nextInt(bound);
        }
//        Object[] objects=  Arrays.stream(data).distinct().toArray();
//        for (int i = 0; i <objects.length ; i++) {
//            data[i]= (Integer) objects[i];
//        }

        return data;
    }
}
