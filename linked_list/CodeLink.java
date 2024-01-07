// Linked list with class
// this are the single linkedlist

import java.util.Iterator;
import java.util.LinkedList;

class CrashLink {

    void linked() {
        LinkedList<Integer> lis = new LinkedList<>();
        lis.add(20);
        lis.add(30);
        lis.add(56);
        lis.add(12);

        // sorting the linked list
        Iterator<Integer> itr = lis.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "-->");
        }
        System.out.println("null");
    }
}

public class CodeLink {
    // head node
    Node head;

    // creating the node
    class Node {
        int data;
        Node next;

        Node(int n) {
            this.data = n;
        }
    }

    // inserting or adding the new element in linked list:
    void addFirst(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // adding the element at last
    void addLast(int n) {
        Node newNode = new Node(n);
        Node currnetNode = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (currnetNode.next != null) {
            currnetNode = currnetNode.next;
        }
        currnetNode.next = newNode;
    }
    // deleting the element from first:

    void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // remove last element from the node:
    void removeLast() {
        // corner case
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
        }
        Node last = head.next;
        Node secondLast = head;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // reverse the linked list

    void reverseLink() {
        if (head == null) {
            System.out.println("List is empty");
        }
        if (head.next == null) {
            return;
        }
        Node currnetNode = head.next;
        Node prev = head;
        while (currnetNode != null) {
            Node neNode = currnetNode.next;
            // reverse
            currnetNode.next = prev;

            // update
            prev = currnetNode;
            currnetNode = neNode;
        }
        head.next = null;
        head = prev;

    }

    // recursive reverse
    CodeLink.Node recursiveReverse(Node head) {
        if (head == null) {
            System.out.println("Empty");
        }
        if (head.next == null) {

            return head;
        }
        Node newNode = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    // printing the data of the linkedlist
    void printData() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("There is no data in node");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data);
            return;
        }
        while (currentNode != null) {
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String arg[]) {
        CodeLink obj = new CodeLink();
        obj.addFirst(10);
        obj.addFirst(20);
        obj.addFirst(2);
        obj.addFirst(3);
        obj.addLast(99);

        // print the data
        obj.printData();

        System.out.println();
        // obj.removeFirst();
        // obj.removeLast();
        // obj.printData();

        // obj.reverseLink();
        obj.printData();
        // CrashLink ll = new CrashLink();
        // ll.linked();
        obj.head = obj.recursiveReverse(obj.head);
        obj.printData();

    }
}
