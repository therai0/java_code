// implementating the stack with arraylist

import java.util.ArrayList;
import java.util.Iterator;

// LIFO
// implementating the stack wiht arraylist

class StackStack {
    ArrayList<Integer> arr = new ArrayList<>();

    // isEmpty()
    boolean isEmpty() {
        return arr.size() == 0;
    }

    // adding the element
    void add(int n) {
        arr.add(n);
    }
    // print

    void printStack() {
        if(isEmpty())
        {
            System.out.println("Empty");
            return;
        }
        Iterator<Integer> ir = arr.iterator();
        while (ir.hasNext()) {
            System.out.print(ir.next() + "---");
        }
        System.out.println("Add new");

    }
    // remove
    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }
        int top = arr.get(arr.size()-1);
        arr.remove(top);
    }
}

public class Estack {

    public static void main(String a[]) {
        StackStack obj = new StackStack();
        obj.add(10);
        obj.add(12);
        obj.add(13);

        obj.printStack();
        try{
            obj.pop();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        obj.printStack();

    }
}
