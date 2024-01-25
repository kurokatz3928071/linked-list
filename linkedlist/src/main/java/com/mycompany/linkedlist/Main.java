/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.linkedlist;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
        
    }
    

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void removeAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty. Cannot remove from an empty list.");
            return;
        }

        if (position == 0) {
            head = head.next;
        } else {
            Node current = head;
            Node previous = null;
            int count = 0;

            while (current != null && count < position) {
                previous = current;
                current = current.next;
                count++;
            }

            if (current == null) {
                System.out.println("Invalid position. Position exceeds the length of the list.");
                return;
            }

           
            previous.next = current.next;
        }
    }
}


/**
 *
 * @author Aspire S7
 */
public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.insertAtEnd(1);
        myList.insertAtEnd(2);
        myList.insertAtEnd(3);

        System.out.print("Linked List: ");
        myList.display();

        myList.insertAtEnd(4);
        myList.insertAtEnd(5);

        System.out.print("Updated Linked List: ");
        myList.display();
    }
}
