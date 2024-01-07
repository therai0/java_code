/*
 * Circular queue implementating with array
 * most of operation require only O(1) time compexity.
 */

public class O1 {
    static class BestTime {
        static int front = -1;
        static int rare = -1;
        static int size;
        static int arr[];

        BestTime(int n) {
            arr = new int[n];
            size = n;
        }

        boolean isEmpty() {
            return rare == -1 && front == -1;
        }

        boolean isFull() {
            return (rare + 1) % size == front;
        }

        // void adding or enqueue O(1)
        void add(int n) {
            if (isFull()) {
                System.out.println("isFull");
                return;
            }

            // 1st element add
            if (front == -1) {
                front = 0;
            }
            // this line will return the index of the queue.
            /*
             * when the value of rare is -1(this is when first element is adding it means it
             * should add in index 0)
             * so rare value should be 0 rather then initial value -1.
             * then let the size is 6
             * rare = (rare + 1) % size;
             * rare = (-1 + 1) % 6;
             * rare = 0 % 6;
             * rare = 0;
             * Element will add in index 0;
             * 
             * now rare value is 0
             * when new element is adding the same code will run it means
             * rare = (rare + 1) % size;
             * rare = (0+1) % 6;
             * rare = 1 % 6;
             * rare = 1;
             * % this module sign use to return or give the reminder.
             * Now this element will added in index 1
             */
            rare = (rare + 1) % size;
            arr[rare] = n;
        }

        // void ramove or dequeue O(1)
        int remove() {
            if (isEmpty()) {
                System.out.println("Que us empty");
                return -1;
            }
            int rs = arr[front];
            // when the kue have only one element:
            if (rare == front ) {
                rare = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return rs;

        }

        // return the element which is in the top
        int peek() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String a[]) {
        BestTime obj = new BestTime(4);
        obj.add(10);
        obj.add(12);
        obj.add(34);
        obj.add(35);
        // removing the element 10 and adding the element 90 in the place of 10:
        obj.remove();
        obj.add(90);

        while(!obj.isEmpty())
        {
            System.out.print(obj.peek() + " ");
            obj.remove();
        }
    }
}
