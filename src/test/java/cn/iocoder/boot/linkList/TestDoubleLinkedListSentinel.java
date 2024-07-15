package cn.iocoder.boot.linkList;

import cn.iocoder.boot.array.linkList.DoubleLinkedListSentinel;
import org.junit.Test;

import java.util.LinkedList;

/**
 * @Description
 * @Author xiye
 * @Date 2024/7/16
 */


public class TestDoubleLinkedListSentinel {
    @Test
    public void testInsert() {

        DoubleLinkedListSentinel doubleLinkedListSentinel = new DoubleLinkedListSentinel();
        doubleLinkedListSentinel.addFirst(1);
        doubleLinkedListSentinel.addFirst(1);
        doubleLinkedListSentinel.addFirst(1);
        doubleLinkedListSentinel.addFirst(1);
        doubleLinkedListSentinel.insertNode(3, 2);
        for (Integer i : doubleLinkedListSentinel) {
            System.out.println(i);
        }
    }

}
