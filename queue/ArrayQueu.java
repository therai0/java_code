// operation
/*
 * add or enqueue
 * remove or dequeue
 * peek() return the last or top element in queue 
 */
/*
 * Most of the operation such as remove or dequeue require o(n) time complexcity
 * 
 */

class ArrayQueu {
    static int rare = 0;
    static int size;
    static int[] arr;

    ArrayQueu(int s) {
        size = s;
        arr = new int[s];
    }

    // isEmpty
    static boolean isEmpty() {
        return rare == 0;
    }

    // enqueue O(1)
    void add(int n) {
        if (rare == size) {
            System.out.println("Queue is full");
            return;
        }
        arr[rare] = n;
        rare += 1;
    }

    // dequeue O(n)
    void remove() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        for (int i = 0; i < rare; i++) {
            arr[i] = arr[i + 1];
        }
        rare--;
    }

    // print
    void printData() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        for (int i = 0; i < rare; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // peek() O(n)
    void peek() {
        System.out.println(arr[0]);
    }

    public static void main(String n[]) {
        ArrayQueu obj = new ArrayQueu(5);
        obj.add(10);
        obj.add(12);
        obj.add(13);
        obj.add(14);

        obj.printData();
        System.out.println();
        obj.peek();
        System.out.println();
        obj.remove();
        obj.printData();
        System.out.println();
        obj.peek();
    }
}
