// implementating the stack with linked list

public class StackNode {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int n) {
            this.data = n;
        }
    }

    // adding element in stack
    void add(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // removing the element
    void remove() {
        if (head == null) {
            System.out.println("stack is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    // print element from node
    void printNode() {
        if (head == null) {
            System.out.println("stack is empty");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data);
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
    // peek
    void peek()
    {
        if (head == null) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println(head.data); 
    }

    public static void main(String ar[]) {
        StackNode obj = new StackNode();
        obj.add(12);
        obj.add(34);
        obj.add(90);

        obj.printNode();
        obj.remove();
        System.out.println();
        obj.peek();
    }
}
