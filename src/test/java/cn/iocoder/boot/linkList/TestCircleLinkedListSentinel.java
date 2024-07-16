package cn.iocoder.boot.linkList;

import cn.iocoder.boot.array.linkList.CircleLinkedListSentinel;
import org.junit.Test;

/**
 * @Description
 * @Author xiye
 * @Date 2024/7/17
 */


public class TestCircleLinkedListSentinel {
    @Test
    public void testF() {
        CircleLinkedListSentinel list = new CircleLinkedListSentinel();
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(1);
        for (Integer i : list) {
//            System.out.println(i);
        }
    }

    @Test
    public void testLast() {
        CircleLinkedListSentinel list = new CircleLinkedListSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.removeFirst();
        list.removeLast();
        list.removeValue(6);

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
