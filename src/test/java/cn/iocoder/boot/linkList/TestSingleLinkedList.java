package cn.iocoder.boot.linkList;

import cn.iocoder.boot.array.linkList.SingleLinkedList;
import org.junit.Test;

/**
 * @Description
 * @Author xiye
 * @Date 2024/7/11
 */


public class TestSingleLinkedList {

    @Test
    public void test1(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
        singleLinkedList.loop1(value->{
            System.out.println(value);
        });
        singleLinkedList.loop2(value->{
            System.out.println(value);
        });
    }
    @Test
    public void test2(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addFirst(1);
        singleLinkedList.addFirst(2);
        singleLinkedList.addFirst(3);
        for (Integer i : singleLinkedList) {
            System.out.println(i);
        }
    }

}
