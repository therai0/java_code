// With collection

import java.util.LinkedList;
import java.util.Iterator;

class Kollection {
    LinkedList<Integer> ll = new LinkedList<>();

    void Linked() {
        // adding the element in linked list
        ll.add(10);
        ll.add(20);
        ll.add(23);
        ll.add(34);
        ll.add(45);

    }

    void printElement() {
        if (ll == null) {
            System.out.println("empty");
            return;
        }
        Iterator<Integer> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "-->");
        }
        System.out.println("null");

    }

    void remove() {
        if (ll == null) {
            System.out.println("Linked list is empty");
            return;
        }
        ll.removeLast();
    }
}

class OwnCode {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int n) {
            this.data = n;
            this.next = null;
        }
    }

    void addFirst(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void printData() {
        if (head == null) {
            System.out.println("Linked is empty");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data);
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    // adding the element in last
    void addLast(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void printHead() {
        System.out.println(head.data);
    }

    // delete head element
    void removeFirst() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    // removing the last element from the linked list;
    void removeLast() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node first = head.next;
        Node second = head;
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        second.next = null;
    }
}

class Link_one {
    public static void main(String a[]) {
        // Kollection obj = new Kollection();
        // obj.Linked();
        // obj.remove();//remove the last element from the linked list
        // obj.printElement();

        OwnCode ow = new OwnCode();
        ow.addFirst(10);
        ow.addFirst(12);
        ow.addLast(24);

        ow.printData();
        ow.removeFirst();
        // ow.removeLast();
        ow.printData();

    }
}