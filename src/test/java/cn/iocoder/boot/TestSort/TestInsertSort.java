package cn.iocoder.boot.TestSort;

import cn.iocoder.boot.array.Sort.InsertSort;
import org.junit.Test;

/**
 * @Description
 * @Author xiye
 * @Date 2024/7/19
 */

public class TestInsertSort {

    @Test
    public void test() {
        int[] arr = {1, 3, 2, 2, 1};
        InsertSort.insert(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }

    @Test
    public void test2() {
        int[] arr = {1, 3, 2, 2, 1};
        InsertSort.sort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
