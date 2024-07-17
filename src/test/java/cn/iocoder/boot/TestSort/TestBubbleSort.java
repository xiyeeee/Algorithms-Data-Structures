package cn.iocoder.boot.TestSort;

import cn.iocoder.boot.array.Sort.BubbleSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * /**
 *
 * @Description
 * @Author xiye
 * @Date 2024/7/18
 */

public class TestBubbleSort {
    @Test
    public void test1() {
        int[] arr = {5, 2, 3, 4, 1};
        BubbleSort.sort(arr);
        for (int j : arr) {
//            System.out.println(j);
        }
    }

    @Test
    public void test2() {
        int[] arr = {5, 2, 3, 4, 1};
        BubbleSort.sortAgain(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }


}
