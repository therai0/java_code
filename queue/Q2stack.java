// Implementating the queue using the 2 stack.
// converting the lifo(Stack) into Fifo(Queue)

import java.util.Stack;

class Fifo {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // method to check the stack is empty or not
    boolean isEmpty() {
        return s1.isEmpty();
    }

    // adding the element in stack
    void add(int data) {
        // removing the all the element from the stack 1 and pushing it into s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        // when the stack become empty new data will push
        s1.push(data);

        // again removing the all the element from s2 and pushing to s1:
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // for remove
    void remove() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        s1.pop();
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        }
        return s1.peek();
    }
}

public class Q2stack {
    public static void main(String ar[]) {

        Fifo obj = new Fifo();
        obj.add(12);
        obj.add(45);
        obj.add(34);

        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            obj.remove();
        }
    }
}
