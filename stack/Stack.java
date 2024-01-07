import java.util.Stack;
// import java.util.Iterator;

class Istack {

    public static void main(String aar[]) {
        Stack<Integer> s = new Stack<>();
        // inserting element in stack
        s.push(10);
        s.push(12);
        s.push(17);
        s.push(2);

        System.out.println(s);

        // pop method or delete operation
        // s.pop();

        // which element is stort recently
        // int num = s.peek();
        // System.out.println(num);

        // if(s.empty()){
        // System.out.println("Yes empty");
        // }
        // else {
        // System.out.println("Not empty");
        // }

        // search operation:
        // int index = s.search(0);
        // System.out.println(index);
        // if aviable it will return the index otherwise it will return the -1 value

        // Iterator with stack
        // Iterator<Integer> itr = s.iterator();
        // while(itr.hasNext())
        // {
        // Integer n = (Integer) itr.next();
        // System.out.print(n + " ");
        // }

        // Size of the stack:
        // System.out.println(s.size());
        
        //Sort
        s.sort(null);
        System.out.println(s);
    }
}