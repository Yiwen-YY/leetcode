package pers.yiwen.linkedlist._0707;

import pers.yiwen.linkedlist.ListNode;
// Design Linked List
class MyLinkedList {
    ListNode head;
    int size;
    public MyLinkedList() {
        this.size = 0;
        this.head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;

        ListNode node = head;
        for (int i = 0; i < index + 1; i++) {
            node = node.next;
        }

        return node.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        ListNode node = new ListNode(val);
        ListNode temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
        size = size + 1;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        ListNode node = head;
        ListNode temp = node.next;

        for (int i = 0; i < index; i++) {
            node = node.next;
            temp = node.next;
        }

        node.next = temp.next;
        size = size - 1;
    }
}