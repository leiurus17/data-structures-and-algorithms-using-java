package com.structures.linkedlist;

public class SinglyLinkedList {

    private Node start;

    public void insert(int value) {
        Node current = start;

        while(current.next != null) {
            current = current.next;
        }

        current.next = new Node(value);
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.start = new Node(0);

        singlyLinkedList.insert(1);
        singlyLinkedList.insert(4);
        singlyLinkedList.insert(8);
        singlyLinkedList.insert(9);

        // test commit
    }
}
