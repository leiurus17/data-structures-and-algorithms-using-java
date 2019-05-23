package com.structures.linkedlist;

public class SinglyLinkedList {

    Node start;

    public static void main() {

    }

    public void insert(int value) {
        Node current = start;

        while(current.next != null) {
            current = current.next;
        }

        Node newNode = new Node(value);

        current.next = newNode;
    }
}
