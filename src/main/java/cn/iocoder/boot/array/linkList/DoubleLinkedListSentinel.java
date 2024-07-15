package cn.iocoder.boot.array.linkList;

import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * /**
 *
 * @Description 双向链表, 带头结点
 * 单向链表实际没有记录尾结点 , 不需要遍历
 * @Author xiye
 * @Date 2024/7/16
 */
public class DoubleLinkedListSentinel implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = head.next;

            @Override
            public boolean hasNext() {
                return p != last;
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
    static class Node {
        Node prev;
        int value;
        Node next;
    }

    Node head;
    Node last;

    public DoubleLinkedListSentinel() {
        head = new Node(null, 0, null);
        last = new Node(null, 1, null);
        head.next = last;
        last.next = head;
    }

    /**
     * @Description 找打节点
     * @Author xiye
     * @Date
     */

    private Node getNode(int index) {
        int i = -1;
        for (Node p = head; p != last; p = p.next, i++) {
            if (i == index) {
                return p;

            }
        }
        return null;

    }

    // 头插法
    public void addFirst(int value) {
        insertNode(0, value);
    }

    public void loop1(Consumer<Integer> consumer) {

    }

    public void loop2(Consumer<Integer> consumer) {

    }

    /**
     * @Description 尾插法先找到最后一个节点
     * @Author xiye
     * @Date
     */
    private Node findLast() {
        return null;
    }

    /**
     * @Description 尾插法
     * @Author xiye
     * @Date
     */
    public void addLast(int value) {
        Node pre = last.prev;
        Node insertNode = new Node(pre, value, last);
        pre.next = insertNode;
        last.prev = insertNode;

    }

    public void removeLast() {
        Node removeNode = last.prev;
        if (removeNode == head) {
            throw new NullPointerException();
        }
        last.prev = removeNode.prev;
        removeNode.prev.next = last;
    }

    /**
     * @Description
     * @Author xiye
     * @Date
     */


    public int getNodeValue(int index) {

        return 0;
    }

    /**
     * @Description 增加
     * @Author xiye
     * @Date
     */
    public void insertNode(int index, int value) {
        Node pre = getNode(index - 1);
        if (pre == null) {
            throw new NullPointerException();
        }
        Node after = pre.next;
        Node newNode = new Node(pre, value, after); // 这里简化了
        pre.next = newNode;
        after.prev = newNode;
    }

    /**
     * @Description
     * @Author xiye
     * @Date
     */

    public void deleteFirst() {
        deleteNode(0);
    }

    /**
     * @Description 删除节点 ,
     * java语言中 , 如果没有任何引用, 垃圾回收就会释放内存
     * 其他语言如果没有自动管理内存的 , 不会释放
     * @Author xiye
     * @Date
     */
    public void deleteNode(int index) {
        Node pre = getNode(index - 1);
        if (pre == null) {
            throw new NullPointerException();
        }
        Node delete = pre.next;
        Node after = delete.next;
        if (after == last) {
            throw new NullPointerException();
        }
        pre.next = after;
        after.prev = pre;

    }
}
