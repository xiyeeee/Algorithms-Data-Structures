package cn.iocoder.boot;
/**
 * @Description
 * @Author xiye
 * @Date 2024/7/9
 */

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static cn.iocoder.boot.DoubleSearch.*;
import static org.junit.Assert.assertEquals;

/**
 * @Description
 * @Author xiye
 * @Date 2024/7/9
 */
public class TestDoubleSearch {
    /**
     *
     */
    @Test
    @DisplayName("1212")
    public void test1() {

        int[] a = {1, 2, 3, 4, 7, 8};
//        assertEquals(0, Search(a, 1));
//        assertEquals(0, greSearch(a, 1));
    }

    @Test
    @DisplayName("递归")
    public void test2() {

        int[] a = {1, 2, 3, 4, 7, 8};
        System.out.println(f(a, 7, 0, a.length - 1));
    }
}
