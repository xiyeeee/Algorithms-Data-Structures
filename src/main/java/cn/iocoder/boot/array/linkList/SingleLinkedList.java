package cn.iocoder.boot.array.linkList;

import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @Description
 * @Author xiye
 * @Date 2024/7/11
 * <p>
 * guan
 */
/*
 关于类中 什么时候加static , 经验 , 如果一个一个静态类中与外部的成员变量
 那他就不能使用static修饰
 * */
public class SingleLinkedList implements Iterable<Integer> {
    /**
     *
     */
    private Node head;

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = head;

            @Override
            public boolean hasNext() {
                return p != null;
            }

            @Override
            public Integer next() {
                int val = p.value;
                p = p.next;
                return val;
            }
        };
    }


    @AllArgsConstructor
    private static class Node {
        int value;
        Node next;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    // 头插法
    public void addFirst(int value) {
        head = new Node(value, head);
    }

    public void loop1(Consumer<Integer> consumer) {
        Node p = head;
        while (p != null) {
            consumer.accept(p.value);
            p = p.next;
        }
    }

    public void loop2(Consumer<Integer> consumer) {
        for (Node p = head; p != null; p = p.next) {
            consumer.accept(p.value);

        }
    }

    /**
     * @Description 尾插法先找到最后一个节点
     * @Author xiye
     * @Date
     */
    private Node findLast() {
        if (head == null) return null;
        Node p;
        for (p = head; p.next != null; p = p.next) {
        }
        return p;
    }

    /**
     * @Description 尾插法
     * @Author xiye
     * @Date
     */
    public void addLast(int value) {
        Node last = findLast();
        if (last == null) {
            addFirst(value);
            return;
        }
        last.next = new Node(value, null);
    }

    /**
     * @Description
     * @Author xiye
     * @Date
     */
    private Node getNode(int index) {
        int i = 0;
        for (Node p = head; p.next != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    public int getNodeValue(int index) {

        Node node = getNode(index);
        System.out.println(node);
        if (node == null) {
            throw new IllegalArgumentException(
                    String.format("index [%d] 不合法 %n ", index)
            );
        }
        return node.value;
    }

}
