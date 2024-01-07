class Node {
    int data;
    Node next;

    Node(int n) {
        this.data = n;
        this.next = null;
    }
}

class ImplementStackWithLinkedlist {
    Node head;

    void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    int top() {
        if (head == null) {
            System.out.println("Empty");
            return 0;
        } else {
            return head.data;
        }
    }

    void pop() {
        if (head == null) {
            System.out.println("Empty");
            return;
        } else {
            head = head.next;
        }

    }

    void printAllNode() {
        if (head == null) {
            System.out.println("Empty");
            return;
        } else {
            Node cuNode = head;
            while (cuNode != null) {
                System.out.println(cuNode.data);
                cuNode = cuNode.next;
            }
        }
    }
}

class ImplementStackWithArray {
    int[] arr;
    int size;
    int front = -1;

    ImplementStackWithArray(int size) {
        arr = new int[size];
        this.size = size;
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean stackIsFull() {
        return front == size;
    }

    void push(int n) {
        front++;
        if (stackIsFull()) {
            System.out.println("Stack overflow");
            return;
        } else {
            arr[front] = n;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            int temp = arr[front];
            front--;
            return temp;
        }
    }

    void printData() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = front; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    void printFrontvalue() {
        System.out.println(front);
    }
}

public class StackWithArray {

    public static void main(String arg[]) {
        ImplementStackWithArray stak = new ImplementStackWithArray(5);
        stak.push(11);
        stak.push(12);
        stak.push(13);
        stak.push(14);
        stak.push(15);

        // stak.pop();
        // stak.printData();

        // implementating the stack with linked list
        ImplementStackWithLinkedlist obj = new ImplementStackWithLinkedlist();
        obj.push(10);
        obj.push(45);
        obj.push(34);
        obj.push(100);
        obj.printAllNode();
        System.out.println();
        obj.pop();
        obj.printAllNode();
    }
}
