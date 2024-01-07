public class ReversLink {

     Node head;
    private int size;

    ReversLink() {
        this.size = 0;
    }

    // Lets create the node:
    class Node {
        String data;
        Node next;

        // initilizing the value of next and data:
        Node(String str) {
            this.data = str;
            this.next = null;
            size++;
        }
    }

    // Adding the element in list:or adding the element in first
    void addFirst(String s) {
        Node newNode = new Node(s);
        if (head == null) {
            head = newNode;
            return;
        }
        // adding element in first
        newNode.next = head;
        head = newNode;
    }
    // adding the element in last

    void addLast(String s) {
        Node newNode = new Node(s);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        // If the next of the element is null then that element is last element
        currentNode.next = newNode;
    }

    // Printing the node of the element
    void printNode() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "-->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    // deleting the element from the first

    void deleteFirst() {
        // corner case
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;
        head = head.next;
    }

    void deleteLast() {
        // corner case
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        size--;
        // corner case
        if (head.next == null) {
            head = null;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    int getSize() {
        return size;
    }

    // Method to reverse the linkedlist:
    void reverseNode() {
        if (head == null) {
            System.out.println("Node is empty");
            return;
        }
        if (head.next == null) {
            System.out.println("Single element is aviable in linked list");
            return;
        }
        Node prevNode = head;
        Node currentNode = head.next;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            // for reverse:
            currentNode.next = prevNode;

            // update the node:
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // recursive function
    Node recursiveReverse(Node head) {
        if (head.next == null || head == null) {
            return head;
        }
        Node newNode = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;

    }

    public static void main(String ar[]) {
        ReversLink obj = new ReversLink();
        obj.addFirst("a");
        obj.addLast("b");
        obj.addLast("c");
        obj.addLast("d");

        obj.printNode();
        // after reverse:

        System.out.println("after the reverse:");
        obj.reverseNode();
        obj.printNode();
        // System.out.println();

        // obj.head = obj.recursiveReverse(obj.head);
        // obj.printNode();
    }

}
