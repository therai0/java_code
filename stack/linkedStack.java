// implementating the stack using the linked list

// implementating the stack with array list

import java.util.ArrayList;

class ArrayListStack {
    ArrayList<Integer> al = new ArrayList<>();

    boolean isEmpty() {
        return al.size() == 0;
    }

    // adding the element in arraylist
    void push(int n) {
        al.add(n);
    }

    // pop the element;
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        // getting the last element from the arraylist
        int n = al.get(al.size() - 1);
        // removing the last element from the array list
        al.remove(al.size() - 1);
        System.out.println(n + " is deleted from stack");
    }

    // implement the peek function
    void peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(al.get(al.size()-1));
    }
    void printData() {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + "-->");
        }
        System.out.println("end");
    }

}

public class linkedStack {

    // create the new node
    static class Node {
        int data;
        Node next;

        Node(int n) {
            this.data = n;
            this.next = null;
        }
    }

    // let's create the stack
    static class CrashStack {
        public static Node head;

        public boolean isEmpty() {
            return head == null;
        }

        // adding element
        public void push(int n) {
            Node newNode = new Node(n);
            if (!isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // deleting the element
        public int pop() {
            if (head == null) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek method
        public int peek() {
            if (head == null) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String ar[]) {
        // CrashStack s = new CrashStack();
        // s.push(5);
        // s.push(34);
        // s.push(3);
        // s.push(12);

        // while (s.isEmpty()) {
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        ArrayListStack stack = new ArrayListStack();
        // stack.push(10);
        // stack.push(20);
        // stack.push(40);
        // stack.push(5);
        
        // print
        // stack.printData();/
        // stack.pop();
        // stack.printData();
        stack.peek();

    }
}
