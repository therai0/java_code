class Node {
    int data;
    Node next, prev;

    Node(int n) {
        this.data = n;
        this.next = null;
        this.prev = null;
    }
}

public class Double {
    Node head;
    Node tail;

    Double() {
        this.head = null;
        this.tail = null;
    }

    void add(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void printForward() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data);
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    void printBackWard() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data);
            return;
        }
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.prev;
        }
        System.out.println("null");
    }

    public static void main(String ar[]) {
        Double obj = new Double();
        obj.add(12);
        obj.add(34);
        obj.add(89);
        obj.add(45);

        obj.printForward();
        System.out.println();
        obj.printBackWard();
    }
}
