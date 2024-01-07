class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ClassToImplementStackWithLinkedlist {
    Node head;

    boolean isEmpty() {
        return head == null;
    }

    void addTop(int n) {
        Node newNode = new Node(n);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void addBtm(int n) {
        Node newNode = new Node(n);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    void printData() {
        Node currNode = head;
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        while (currNode != null) {
            System.out.print(currNode.data + "  ");
            currNode = currNode.next;
        }
    }

    int size() {
        if (isEmpty()) {
            return 0;
        }
        int size = 0;
        Node curNode = head;
        while (curNode != null) {
            size += 1;
            curNode = curNode.next;
        }
        return size;
    }
}

class Isstack {
    public static void main(String arp[]) {
        ClassToImplementStackWithLinkedlist obj = new ClassToImplementStackWithLinkedlist();
        obj.addTop(10);
        obj.addTop(90);
        obj.addTop(89);
        obj.addBtm(100);
        obj.printData();
        System.out.println();
        System.out.println(obj.size());
    }
}