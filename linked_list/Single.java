class Node {
    String name;
    Node next;

    Node(String name) {
        this.name = name;
        this.next = null;
    }
}

class Single {
    Node head;
    Node tail;

    boolean isEmpty() {
        return head == null;
    }

    int size() {
        int size = 0;
        Node currNode = head;
        while (currNode != null) {
            size++;
            currNode = currNode.next;
        }
        return size;
    }

    void addFirst(String name) {
        Node newNode = new Node(name);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void addLast(String name) {
        Node newNode = new Node(name);
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

    void addInNPosition(String name, int position) {
        Node newNode = new Node(name);
        if (position > size() || position < 0) {
            System.out.println("Invalid position");
            return;
        } else if (isEmpty()) {
            head = newNode;
            return;
        } else {
            int n = 0;
            Node curNode = head;
            while (n < position - 1) {
                curNode = curNode.next;
                n++;
            }
            newNode.next = curNode.next;
            curNode.next = newNode;
        }
    }

    void deleteFirst() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        } else if (head.next == null) {
            head = null;
            return;
        } else {
            head = head.next;
            return;
        }
    }

    void deleteLast() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        } else if (head.next == null) {
            head = null;
            return;
        } else {
            Node cuNode = head;
            int i = 1;
            while (i < size() - 1) {
                cuNode = cuNode.next;
                i++;
            }
            cuNode.next = null;
        }
    }

    void deleteNposition(int position) {
        if (position > size() || position < 0) {
            System.out.println("Invalid position");
            return;
        } else if (isEmpty()) {
            System.out.println("Empty");
            return;
        } else if (head.next == null) {
            head = null;
            return;
        } else if (position == 1) {
            head = head.next;
            return;
        } else {
            int i = 1;
            Node cuNode = head;
            while (i < position - 1) {
                cuNode = cuNode.next;
                i++;
            }
            cuNode.next = cuNode.next.next;
        }
    }

    void findMaxElementInLinkedList() {
        Node currNode = head;
        String max_value = null;
        while (currNode.next != null) {
            if ((currNode.name.compareTo(currNode.next.name)) > 0) {
                max_value = currNode.name;
            } else if ((currNode.name.compareTo(currNode.next.name)) < 0) {
                max_value = currNode.next.name;
            } else {
                max_value = currNode.name;
            }
            currNode = currNode.next;
        }
        System.out.println("Max value is:" + max_value);
    }

    void printNode() {
        if (isEmpty()) {
            System.out.println("Node is empty");
            return;
        }
        if (head.next == null) {
            System.out.println(head.name + "-->");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.name + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    void createCircularLL(String name) {
        // all the node are adding first.
        Node newNode = new Node(name);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    void addLastInCircularll(String name) {
        Node newNode = new Node(name);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }
    }

    int sizeOfCLL() {
        Node curNode = head;
        int i = 1;
        do {
            i++;
            curNode = curNode.next;
        } while (curNode != head);
        return i;
    }

    void addInNPositionInCLL(String name, int position) {
        Node newNode = new Node(name);
        if (position > sizeOfCLL() || position < 0) {
            System.out.println("Invalid position");
            return;
        } else if (isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        } else if (position == 1) {
            newNode.next = head;
            head = newNode;
            tail.next = head;
            return;
        } else {
            Node temp = head;
            int i = 1;
            while (i < position - 1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            return;
        }
    }

    void deleteNpositionNodeInCLL(int position) {
        if (position > sizeOfCLL() || position < 0) {
            System.out.println("Invalid position");
            return;
        } else if (isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        } else if (position == 1) {
            head = head.next;
            tail.next = head;
            return;
        } else {
            int i = 1;
            Node currNode = head;
            while (i < position - 1) {
                currNode = currNode.next;
                i++;
            }
            currNode.next = currNode.next.next;
        }
    }

    void printCircularLL() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        } else {
            Node temp = head;
            do {
                System.out.print(temp.name + "-->");
                temp = temp.next;
            } while (temp != head);
            System.out.println("head");
        }
    }

    public static void main(String ar[]) {
        Single singlell = new Single();
        singlell.addFirst("Hari");
        singlell.addFirst("Hari");
        singlell.addFirst("Ram");
        singlell.addLast("Money");      
         singlell.addLast("ZMoney");
        singlell.findMaxElementInLinkedList();
        // singlell.addInNPosition("Poisa", singlell.size());
        // singlell.printNode();
        // System.out.println();
        // singlell.deleteNposition(10);
        // singlell.deleteFirst();
        // singlell.deleteLast();
        // singlell.deleteLast();
        // singlell.printNode();
        // singlell.createCircularLL("Mam");
        // singlell.createCircularLL("yonh");
        // singlell.createCircularLL("ok");
        // singlell.addLastInCircularll("quwe");
        // singlell.addLastInCircularll("Oppa");
        // singlell.addLastInCircularll("stack");
        // singlell.addLastInCircularll("linked");
        // singlell.addInNPositionInCLL("huda", 1);
        // singlell.printCircularLL();
        // System.out.println();
        // singlell.deleteNpositionNodeInCLL(1);
        // singlell.printCircularLL();
    }
}