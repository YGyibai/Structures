package SelectionSort;

import common.ArrayGenerator;
import common.SortingHelper;

/**
 * 选择排序
 *
 * @Description: 选择排序
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-07-17 20:05
 */
public class SelectionSort {
    private SelectionSort() {
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public static <T extends Comparable<T>> void sort(T[] arr) {
        //arr[0...i)是已排序的i，arr[i...n)是未排序的
        for (int i = 0; i < arr.length; i++) {
            //查找最小值的索引
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, minIndex,i);
        }
    }

    //交换数据
    private static <T> void swap(T[] arr, int i, int minIndex) {
        T temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void main(String[] args) {
        /**
         * 测试用例1
         *   Integer[] data = {1, 4, 2, 3, 6, 5};
         *         SelectionSort.sort(data);
         *         for (int datum : data) {
         *             System.out.println(datum);
         *         }
         */

        /**
         * 测试用例2
         *      Stu[] stus = {new Stu("a", 13), new Stu("b", 14),
         *                 new Stu("c", 37), new Stu("d", 23)};
         *         sort(stus);
         *         for (Stu stu : stus) {
         *             System.out.println(stu);
         *         }
         */
        /**
         * 测试用例3
         *         int number = 100000;
         *         long startTime = System.nanoTime();
         *         Integer[] data = ArrayGenerator.generatorRandomArray(number, number);
         *         //排序
         *         sort(data);
         *         //校检结论
         *         SortingHelper.isSort(data);
         *         long endTime = System.nanoTime();
         *         double time = (endTime - startTime) / 1000000000.0;
         *         System.out.println("number=" + number + "," + "runs:\t" + time + "s");
         */
        int[] dataSize={10000,100000};
        for (int i : dataSize) {
            Integer[] arr= ArrayGenerator.generatorRandomArray(i,i);
            SortingHelper.sortTest("insertionSort",arr);
        }

    }
}
