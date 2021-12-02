package linkedSearch;

import common.ArrayGenerator;

/**
 * 线性查找
 *
 * @Description:
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-07-13 10:09
 */
public class LinearSearch<T> {
    private LinearSearch() {
    }

    /**
     * 线性查找
     *
     * @param data
     * @param target
     * @param <T>
     * @return
     */
    public static <T> int search(T[] data, T target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target))
                return i;
        }
        return -1;
    }

    //测试
    public static void main(String[] args) {
        int[] dataSize = {1000000, 10000000};
        for (int number : dataSize) {
            long startTime = System.nanoTime();
            Integer[] data = ArrayGenerator.generatorArrayOrder(number);
            for (int i = 0; i < 100; i++) {
                LinearSearch.search(data, number);
            }
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1000000000.0;
            System.out.println("number=" + number + "," + 1 + "runs:\t" + time + "s");
        }
    }


}
