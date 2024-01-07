class Node {
    String name;
    Node next;
    Node prev;

    Node(String name) {
        this.name = name;
        this.next = null;
        this.prev = null;
    }
}

public class Doble {
    Node head;
    Node tail;

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(String name) {
        Node newNode = new Node(name);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            return;
        }
    }

    int size() {
        int i = 1;
        Node cuNode = head;
        while (cuNode != null) {
            cuNode = cuNode.next;
            i++;
        }
        return i;
    }

    void addEnd(String name) {
        Node newNode = new Node(name);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            return;
        }
    }

    void addInNthPosition(int position, String name) {
        Node newNode = new Node(name);
        if (position > size() || position < 0) {
            System.out.println("Invalid position");
            return;
        } else if (isEmpty()) {
            tail = newNode;
            head = newNode;
            return;
        } else if (position == 1) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            int i = 1;
            Node currNode = head;
            while (i < position - 1) {
                currNode = currNode.next;
                i++;
            }
            newNode.next = currNode.next;
            currNode.next.prev = newNode;
            currNode.next = newNode;
            newNode.prev = currNode;
            return;
        }
    }

    void deleteNthNode(int position) {
        if (position > size() || position < 0) {
            System.out.println("Invalid position");
            return;
        } else if (isEmpty()) {
            System.out.println("Empty");
            return;
        } else if (position == 1) {
            head = head.next;
            head.prev = null;
            return;
        } else {
            int i = 1;
            Node currNode = head;
            while (i < position - 1) {
                currNode = currNode.next;
                i++;
            }
            currNode.next = currNode.next.next;
            currNode.next.prev = currNode;
            return;
        }
    }

    void printFromFirst() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        } else {
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.name + "-->");
                currNode = currNode.next;
            }
            System.out.println("null");
            return;
        }
    }

    void printFromLast() {
        Node curNode = tail;
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        } else {
            while (curNode != null) {
                System.out.print(curNode.name + "-->");
                curNode = curNode.prev;
            }
            System.out.println("null");
            return;
        }
    }

    public static void main(String arg[]) {
        Doble obj = new Doble();
        obj.addFirst("Ram");
        obj.addFirst("Krish");
        obj.addFirst("Hari");
        obj.addFirst("Hero");
        obj.addEnd("Last");
        obj.addInNthPosition(3, "Murra");
        obj.printFromFirst();
        System.out.println();
        obj.deleteNthNode(1);
        obj.printFromFirst();
        // obj.printFromLast();
    }
}
