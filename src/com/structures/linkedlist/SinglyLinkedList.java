package com.structures.linkedlist;

import java.util.logging.Logger;

public class SinglyLinkedList {

    private Node start;

    public void insert(int value) {
        Node current = start;

        while(current.next != null) {
            current = current.next;
        }

        current.next = new Node(value);
    }

    public void printValues() {

        Node current = start;

        while(current != null) {

            System.out.println(current.value);

            current = current.next;
        }
    }

    public void deleteNode(int value) {

        if (value == start.value) {
            start = start.next;
            return;
        }

        Node current = start;

        while(current.next.value != value) {
            current = current.next;
        }

        current.next = current.next.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.start = new Node(0);

        singlyLinkedList.insert(1);
        singlyLinkedList.insert(4);
        singlyLinkedList.insert(8);
        singlyLinkedList.insert(9);

        singlyLinkedList.printValues();

        singlyLinkedList.deleteNode(4);

        singlyLinkedList.printValues();
    }
}
