
class ClassToDeleteNode {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int n) {
            next = null;
            this.data = n;
        }
    }

    void add(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    boolean isEmpty() {
        return head == null;
    }

    void remove() {
        if (head == null) {
            System.out.println("No item");
            return;
        }
        if (head.next == null) {
            head = null;
            // System.out.println("head node is deleted");
            return;
        }
        head = head.next;
    }

    int peek() {
        if (head == null) {
            System.out.println("Empty");
            return 0;
        }
        if (head.next == null) {
            return head.data;
        }
        return head.data;
    }

    int size() {
        int n = 0;
        Node currNode = head;
        while (currNode != null) {
            n++;
            currNode = currNode.next;
        }
        return n;
    }

    void printAllNode() {
        if (isEmpty()) {
            System.out.println("There is no node");
            return;
        }
        if (head.next == null) {
            System.out.println(head.data);
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "-->");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    void DeleteNthNode(int n) {
        if (n <= 0 || n > size()) {
            System.out.println("Invalid N number");
            return;
        }
        if(n == size())
        {
            head = head.next;
        }
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int indexToDelete = size() - n;
        int j = 1;
        Node curr = head;
        while (j < indexToDelete) {
            curr = curr.next;
            j++;
        }
        curr.next = curr.next.next;
    }
}

public class DeleteNode {

    public static void main(String ar[]) {
        ClassToDeleteNode obj = new ClassToDeleteNode();
        obj.add(10);
        obj.add(89);
        obj.add(45);
        obj.add(457);
        obj.add(8989);
        obj.printAllNode();
        System.out.println();
        obj.DeleteNthNode(5);
        obj.printAllNode();
    }
}
