// implementating the queue with best time complexity
class TimeCompex {
    int front = -1;
    int rare = -1;
    int size;
    int[] arr;

    TimeCompex(int n) {
        arr = new int[n];
        size = n;
    }

    // full or not queue
    boolean isFull() {
        return (rare + 1) % size == front;
    }

    // empty
    boolean isEmpty() {
        return rare == -1 && front == -1;
    }

    // enqueue O(1)
    void add(int n) {
        if (isFull()) {
            System.out.println("Now queue is full");
            return;
        }
        // when first element is added
        if (front == -1) {
            front = 0;
        }
        rare = (rare + 1) % size;
        arr[rare] = n;
    }

    // dequeue
    void remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        if (rare == front) {
            rare = front = -1;
        } else {
            front = (front + 1) % size;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        return arr[front];
    }
    void printData() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do {
            System.out.println(arr[i]);
            i = (i + 1) % size;
        } while (i != (rare + 1) % size);
    }
}


public class Time {
    public static void main(String ar[])
    {
        TimeCompex obj = new TimeCompex(5);
        obj.add(12);
        obj.add(23);
        obj.add(90);
        obj.add(89);
        obj.add(78);

        // obj.peek();
        // obj.remove();
        // System.out.println(obj.peek());
        obj.printData();

    }
    }
