// Implementating the queue with linked list:
// O(1)

public class LinkQueue {
    Node head = null;
    Node tail = null;

    class Node {
        int data;
        Node next;

        Node(int n) {
            this.data = n;
            next = null;
        }
    }

    boolean isEmpty()
    {
        return head == null && tail == null;
    }
    void add(int num) {
        Node newNode = new Node(num);
        // adding first element
        if (tail == null) {
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    void remove() {
        if (head == null && tail == null) {
            System.out.println("Empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
            // System.out.println("Remove single element.");
            return;
        }
        head = head.next;
    }

    void printData() {
        if (head == null && tail == null) {
            System.out.println("Empty");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data);
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    int  peek() {
        // System.out.println(head.data);
        return head.data;
    }

    public static void main(String ar[]) {
        LinkQueue obj = new LinkQueue();
        obj.add(10);
        obj.add(23);
        obj.add(32);
        obj.add(39);
       
        while(!obj.isEmpty())
        {
            System.out.print(obj.peek() + "-->");
            obj.remove();
        }

    }
}
