class Node {
    int data;
    Node next;

    Node(int n) {
        this.data = n;
        this.next = null;
    }
}

public class CircularLL {
    Node head;
    Node tail;

    void add(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void printData() {
        Node curNode = head;
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        do {
            System.out.print(curNode.data + "-->");
            curNode = curNode.next;
        } while (curNode != head);
        System.out.println("null");
    }

    boolean isTailNextIsHead() {
        return tail.next == head;
    }

    public static void main(String arg[]) {
        CircularLL obj = new CircularLL();
        obj.add(10);
        obj.add(89);
        obj.add(8);
        obj.printData();
        System.out.println();
        System.out.println(obj.isTailNextIsHead());
    }
}
