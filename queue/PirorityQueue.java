class Node {
    int data;
    int pirority;
    Node next;

    Node(int data, int pirority) {
        this.data = data;
        this.pirority = pirority;
        this.next = null;
    }
}

public class PirorityQueue {
    Node front;
    Node rare;

    void enqueu(int data, int prio) {
        Node newNode = new Node(data, prio);
        if (front == null) {
            front = newNode;
            rare = newNode;
            return;
        } else {
            rare.next = newNode;
            rare = newNode;
        }
    }

    void dequeue(int piro) {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        } else {
            Node currNode = null;
            currNode.next = front;
            while (currNode.next != null) {
                if (currNode.next.data == piro) {
                    currNode.next = currNode.next.next;
                }
                currNode = currNode.next;
            }
        }
    }

    void displayQueue() {
        Node currNode = front;
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        } else {
            while (currNode != null) {
                System.out.print(currNode.data + "-->");
                currNode = currNode.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String arg[])
    {
        PirorityQueue obj = new PirorityQueue();
        obj.enqueu(100, 1);
        obj.enqueu(123,2);
        obj.enqueu(9090, 3);
        obj.displayQueue();
        obj.dequeue(1);
        System.out.println();
        obj.displayQueue();

    }
}
/*
 * class PriorityQueueNode {
    int data;
    int priority;
    PriorityQueueNode next;

    public PriorityQueueNode(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

public class PriorityQueue {
    private PriorityQueueNode front;

    public PriorityQueue() {
        this.front = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data, int priority) {
        PriorityQueueNode newNode = new PriorityQueueNode(data, priority);

        if (isEmpty() || priority < front.priority) {
            newNode.next = front;
            front = newNode;
        } else {
            PriorityQueueNode temp = front;
            while (temp.next != null && temp.next.priority <= priority) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Priority queue is empty. Cannot dequeue.");
            return -1; // or throw an exception
        }

        int minValue = front.data;
        front = front.next;

        return minValue;
    }

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.enqueue(4, 2);
        priorityQueue.enqueue(2, 1);
        priorityQueue.enqueue(6, 3);
        priorityQueue.enqueue(1, 0);

        while (!priorityQueue.isEmpty()) {
            int min = priorityQueue.dequeue();
            System.out.println("Dequeued: " + min);
        }
    }
}

 */