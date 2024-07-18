package cn.iocoder.boot.array.Sort;

/**
 * @Description 插入排序 , 平时打牌
 * @Author xiye
 * @Date 2024/7/19
 */


public class InsertSort {
    public static void sort(int[] arr) {
    }

    /**
     * @Description 普通实现
     * @Author xiye
     * @Date
     */

    public static void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // 用来插入的值 , 每次会更新
            int j = i - 1; // 比较单位
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}
