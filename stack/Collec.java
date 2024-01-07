// import java.util.Iterator;
import java.util.Stack;

// implementating the stack with array
class Arr {
    int arr[];
    int size;
    int rare = 0;

    Arr(int n) {
        arr = new int[n];
        this.size = n;
    }

    // adding the element in stack
    void push(int num) {
        if(rare == size)
        {
            System.out.println("Stack is full");
            return;
        }
        arr[rare] = num;
        rare += 1;
    }
    void remove()
    {
        if(size == 0)
        {
            System.out.println("Stack is empty");
            return;
        }
        rare -= 1;
    }
    void peek()
    {
        System.out.println(arr[rare-1]);
    }
    // print the all the number from stack
    void printNum()
    {
        for(int i= 0 ; i < rare; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

public class Collec {
    // adding the element at buttom
    static void pushBottom(int n, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(n);
            return;
        }
        int top = s.pop();
        pushBottom(n, s);
        s.push(top);
    }

    // reverse the stack
    static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushBottom(top, s);
    }

    public static void main(String a[]) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        // s.add(34);
        // pushBottom(100, s);
        // reverse(s);
        // Iterator<Integer> itr = s.iterator();
        // while (itr.hasNext()) {
        //     System.out.print(itr.next() + " ");
        // }
        // System.out.println(s.peek());

        // implementating the stack with array
        Arr ar = new Arr(4);
        ar.push(12);
        ar.push(34);
        ar.push(2);
        ar.push(3);

        ar.printNum();
        ar.remove();
        System.out.println();
        ar.peek();
    }
}
