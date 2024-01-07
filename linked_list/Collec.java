//1.Make a Linked List & add the following elements to it : (10,2,3,,1,29). Search for the number 2 & //display its index.
//2.Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all //nodes which have values greater than 25.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class DeleteList {
    void deleteNum() {
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 random number");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            ll.add(num);
        }
        sc.close();
        // removing all the number which is greater then 10
        Iterator<Integer> itr = ll.iterator();
        while (itr.next() > 10) {
            itr.remove();
        }

        // let's print the number
        if (ll.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (int i = 0; i < ll.size(); i++) {
                System.out.print(ll.get(i) + " ");
            }
        }
    }
}

public class Collec {
    public static void main(String a[]) {
        // LinkedList<Integer> ll = new LinkedList<>();
        // ll.add(10);
        // ll.add(2);
        // ll.add(3);
        // ll.add(1);
        // ll.add(29);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number:");
        // int n = sc.nextInt();
        // sc.close();

        // for (int i = 0; i < ll.size(); i++) {
        // if (ll.get(i) == n) {
        // System.out.println(n + " is located in " + i + " index");
        // return;
        // }
        // }

        // let's create the object of the class:
        DeleteList obj = new DeleteList();
        obj.deleteNum();
    }
}
