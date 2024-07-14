package cn.iocoder.boot.linkList;

import cn.iocoder.boot.array.linkList.SingleLinkedList;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

/**
 * @Description
 * @Author xiye
 * @Date 2024/7/11
 */


public class TestSingleLinkedList {

    @Test
    public void test1() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
        singleLinkedList.loop1(value -> {
//            System.out.println(value);
        });
        singleLinkedList.loop2(value -> {
//            System.out.println(value);
        });
    }

    @Test
    public void test2() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
        for (Integer i : singleLinkedList) {
//            System.out.println(i);
        }
    }

    @Test
    public void test3() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        Assertions.assertIterableEquals(List.of(1, 2), singleLinkedList);
        for (Integer i : singleLinkedList) {
//            System.out.println(i);
        }

    }

    @Test
    public void testGetNode() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        int i = singleLinkedList.getNodeValue(1);

//        System.out.println(i);
//        int j = singleLinkedList.getNodeValue(10);
//        System.out.println(j);
    }

    @Test
    public void testInsertNode() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.insertNode(1, 2);
        singleLinkedList.deleteFirst(); // 测试删除
        for (Integer i : singleLinkedList) {
//            System.out.println(i);
        }
    }

    @Test
    public void testDeleteNode() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(3);
        singleLinkedList.insertNode(1, 2);
        singleLinkedList.deleteNode(0); // 测试删除
        singleLinkedList.deleteNode(2); // 测试删除
        for (Integer i : singleLinkedList) {
            System.out.println(i);
        }
    }

}
