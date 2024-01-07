import java.util.Iterator;
import java.util.LinkedList;

class Linked {
    public static void main(String ar[])
    {
        LinkedList<Integer> link_list = new LinkedList<>();
        // adding the element in linked list
        link_list.add(10);
        link_list.add(23);
        link_list.add(40);
        link_list.add(6);

        // link_list.remove(0); //remove the element of the 0 index
        // link_list.removeLast(); //remove the last element
        // link_list.add(0,45); // add the element at 0 index
        System.out.println(link_list.size());

        Iterator<Integer> itr = link_list.iterator();

        while(itr.hasNext())
        {
            int n = itr.next();
            System.out.print(n + " ");
        }
    }
}
