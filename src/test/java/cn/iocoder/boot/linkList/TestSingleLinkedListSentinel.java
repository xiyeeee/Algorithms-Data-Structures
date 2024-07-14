package cn.iocoder.boot.linkList;

import cn.iocoder.boot.array.linkList.SingleLinkedListSentinel;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

/**
 * /**
 *
 * @Description
 * @Author xiye
 * @Date 2024/7/15
 */
public class TestSingleLinkedListSentinel {

    @Test
    public void test1() {
        SingleLinkedListSentinel SingleLinkedListSentinel = new SingleLinkedListSentinel();
        SingleLinkedListSentinel.addFirst(1);
        SingleLinkedListSentinel.addFirst(2);
        SingleLinkedListSentinel.addFirst(3);
        SingleLinkedListSentinel.loop1(value -> {
            System.out.println(value);
        });
        SingleLinkedListSentinel.loop2(value -> {
//            System.out.println(value);
        });
    }

    @Test
    public void test2() {
        SingleLinkedListSentinel SingleLinkedListSentinel = new SingleLinkedListSentinel();
        SingleLinkedListSentinel.addFirst(1);
        SingleLinkedListSentinel.addFirst(2);
        SingleLinkedListSentinel.addFirst(3);
        for (Integer i : SingleLinkedListSentinel) {
//            System.out.println(i);
        }
    }

    @Test
    public void test3() {
        SingleLinkedListSentinel SingleLinkedListSentinel = new SingleLinkedListSentinel();

        SingleLinkedListSentinel.addLast(1);
        SingleLinkedListSentinel.addLast(2);
        Assertions.assertIterableEquals(List.of(1, 2), SingleLinkedListSentinel);
        for (Integer i : SingleLinkedListSentinel) {
//            System.out.println(i);
        }

    }

    @Test
    public void testGetNode() {
        SingleLinkedListSentinel SingleLinkedListSentinel = new SingleLinkedListSentinel();

        SingleLinkedListSentinel.addLast(1);
        SingleLinkedListSentinel.addLast(2);
        SingleLinkedListSentinel.addLast(3);
        int i = SingleLinkedListSentinel.getNodeValue(1);

//        System.out.println(i);
//        int j = SingleLinkedListSentinel.getNodeValue(10);
//        System.out.println(j);
    }

    @Test
    public void testInsertNode() {
        SingleLinkedListSentinel SingleLinkedListSentinel = new SingleLinkedListSentinel();
        SingleLinkedListSentinel.addLast(1);
        SingleLinkedListSentinel.addLast(2);
        SingleLinkedListSentinel.addLast(3);
        SingleLinkedListSentinel.insertNode(1, 2);
        SingleLinkedListSentinel.deleteFirst(); // 测试删除
        for (Integer i : SingleLinkedListSentinel) {
//            System.out.println(i);
        }
    }

    @Test
    public void testDeleteNode() {
        SingleLinkedListSentinel SingleLinkedListSentinel = new SingleLinkedListSentinel();
        SingleLinkedListSentinel.addLast(1);
        SingleLinkedListSentinel.addLast(2);
        SingleLinkedListSentinel.addLast(3);
        SingleLinkedListSentinel.insertNode(1, 2);
        SingleLinkedListSentinel.deleteNode(0); // 测试删除
        SingleLinkedListSentinel.deleteNode(2); // 测试删除
        for (Integer i : SingleLinkedListSentinel) {
            System.out.println(i);
        }
    }
}
