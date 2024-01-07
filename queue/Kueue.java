
class QueueWithArray {
    int front, rear;// initially the value of both variable in 0
    int q[];
    int sizeofq;

    QueueWithArray(int size) {
        sizeofq = size;
        q = new int[sizeofq];
        rear = 0;
        front = 0;
    }

    // Adding the value or element in queue
    void enqueue(int n) {
        if (rear == sizeofq) {
            System.out.println("Queue is full");
        } else {
            q[rear] = n;
            rear++;
        }
    }

    // deleting the item from the queue
    void dequeue()
    {
        if(rear == 0) {
            System.out.println("Queue is empty");
        }
        else {
            front++;
        } 
    }
// displaying the element of the queue
    void display() {
        if(rear == front)
        {
            System.out.println("No element is aviable in queue");
        }
        else {
            for(int i = front; i < rear; i++)
            {
                System.out.print(q[i] + " ");
            }
        }
    }

}

public class Kueue {
    public static void main(String a[]) {
        QueueWithArray obj = new QueueWithArray(5);
        // adding
        obj.enqueue(10);
        obj.enqueue(5);
        obj.enqueue(2);
        obj.enqueue(13);
        obj.enqueue(0);

        // now you can add any more cuz queue is full
        // obj.enqueue(9);

        // displaying
        obj.display();

        // dequeue
        System.out.println();
        obj.dequeue();
        obj.display();

    }
}
