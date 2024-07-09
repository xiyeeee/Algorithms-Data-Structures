package cn.iocoder.boot;
/**
 * @Description
 * @Author xiye
 * @Date 2024/7/9
 */

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static cn.iocoder.boot.DoubleSearch.Search;
import static cn.iocoder.boot.DoubleSearch.greSearch;
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
        assertEquals(0, Search(a, 1));
        assertEquals(0, greSearch(a, 1));
    }
}
