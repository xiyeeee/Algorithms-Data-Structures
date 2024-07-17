package cn.iocoder.boot.array.Sort;

/**
 * /**
 *
 * @Description 相邻元素排序
 * @Author xiye
 * @Date 2024/7/18
 */
public class BubbleSort {
    public static void sort(int[] arr) {
        bubble(arr, arr.length - 1);
    }

    public static void sortAgain(int[] arr) {
        bubble(arr, arr.length - 1);
    }

    public static void bubble(int[] arr, int j) {
        if (j == 0) return;
        for (int i = 0; i < j; i++) {
            if (arr[i + 1] <= arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubble(arr, j - 1);
    }

    /**
     * @Description 优化界限
     * @Author xiye
     * @Date
     */

    public static void bubbleAgain(int[] arr, int j) {
        if (j == 0) return;
        int x = 0;
        for (int i = 0; i < j; i++) {
            if (arr[i + 1] <= arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                x = i;
            }
        }

        bubble(arr, x);
    }
}
