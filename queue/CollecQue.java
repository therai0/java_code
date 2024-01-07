import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CollecQue {
    public static void main(String ar[])
    {
        Queue<String> qq = new LinkedList<>();
        qq.add("abc");
        qq.add("all");
        qq.add("orange");
        Iterator<String> itr = qq.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
}
