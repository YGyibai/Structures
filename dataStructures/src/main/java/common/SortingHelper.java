package common;

import SelectionSort.SelectionSort;
import insertionSort.InsertionSort;

/**
 * 判断算法是否正确用例
 *
 * @Description: 判断算法是否正确用例
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-07-21 15:48
 */
public class SortingHelper {
    private SortingHelper() {
    }

    /**
     * 判断数组是否是排序的
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T extends Comparable<T>> boolean isSort(T[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i - 1].compareTo(data[i]) > 0)
                return false;
        }
        return true;
    }

    public static <T extends Comparable<T>> void sortTest(String sortName, T[] arr) {
        long startTime = System.nanoTime();
        switch (sortName) {
            case "selectionSort":
                SelectionSort.sort(arr);
                break;
            case "insertionSort":
                InsertionSort.sort(arr);
                break;
            case "insertionSort2":
                InsertionSort.sort2(arr);
                break;
            default:
                break;
        }
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        if (!isSort(arr))
            throw new RuntimeException(sortName + " failed");
        System.out.println(String.format("%s , n= %d : %f s", sortName, arr.length, time));
    }

}
