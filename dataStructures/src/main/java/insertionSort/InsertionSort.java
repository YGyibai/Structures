package insertionSort;

import common.ArrayGenerator;
import common.SortingHelper;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @Description: 插入排序
 * @JDKVersion: 1.8
 * @author: 北风
 * @create: 2021-08-07 11:48
 */
public class InsertionSort {
    private InsertionSort() {
    }

    public static <T extends Comparable<T>> void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //将arr[i] 插入到合适的位置
            for (int j = i; j - 1 >= 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    swap(arr, j - 1, j);
                } else break;

            }
            /**
             * 另一种写法
             *   for (int j = 0; j-1>=0 && arr[i].compareTo(arr[j-1])<0 ; j++) {
             *                 swap(arr,j-1,j);
             *   }
             */

        }

    }
    //建议使用这一种写法
    public static <T extends Comparable<T>> void sort2(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            T t = arr[i];
            int j;
            for (j = i; j - 1 >= 0 && t.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
    }
    

    //交换数据
    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] dataSize = {10000, 100000};
        for (int i : dataSize) {
            System.out.println("Random Array");
            Integer[] arr = ArrayGenerator.generatorRandomArray(i, i);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("selectionSort", arr);
            SortingHelper.sortTest("insertionSort2", arr2);

            System.out.println("order Array");
            arr = ArrayGenerator.generatorArrayOrder(i);
            arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("selectionSort", arr);
            SortingHelper.sortTest("insertionSort2", arr2);
            System.out.println();
        }
    }
}
