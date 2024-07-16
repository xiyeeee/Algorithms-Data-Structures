package cn.iocoder.boot.array.linkList;

import lombok.AllArgsConstructor;

import java.util.Iterator;

/**
 * @Description 双向环形链表
 * @Author xiye
 * @Date 2024/7/17
 */


public class CircleLinkedListSentinel implements Iterable<Integer> {
    private Node sentinel = new Node(null, -1, null);

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = sentinel.next;

            @Override
            public boolean hasNext() {
                return p != sentinel;
            }

            @Override
            public Integer next() {
                int value = p.value;
                p = p.next;
                return value;
            }
        };
    }

    @AllArgsConstructor
    private static class Node {
        Node prev;
        int value;
        Node next;
    }


    public CircleLinkedListSentinel() {
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
    }

    public void addFirst(int value) {
        Node pre = sentinel;
        Node next = sentinel.next;
        Node p = new Node(pre, value, next);
        pre.next = p;
        next.prev = p;
    }

    public void addLast(int value) {
        Node pre = sentinel;
        Node last = sentinel.prev;
        Node p = new Node(last, value, pre);
        last.next = p;
        pre.prev = p;
    }

    public void removeFirst() {
        Node a = sentinel;
        Node deleteNode = a.next;
        a.next = deleteNode.next;
        deleteNode.next.prev = a;

    }

    public void removeLast() {
        Node a = sentinel;
        Node deleteNode = sentinel.prev;
        Node last = deleteNode.prev;
        last.next = a;
        a.prev = last;
    }

    public void removeValue(int value) {
//        for (Node p = sentinel; p.next != sentinel; p = p.next) {
//            if (p.value == value) {
//                Node pre = p.prev;
//                Node next = p.next;
//                pre.next = next;
//                next.prev = pre;
//            }
//        }
        Node p = findValue(value);
        if (p == null) return;
        Node pre = p.prev;
        Node next = p.next;
        pre.next = next;
        next.prev = pre;
    }

    public Node findValue(int value) {
        for (Node p = sentinel; p.next != sentinel; p = p.next) {
            if (p.value == value) {
                return p;
            }
        }
        return null;
    }

}
