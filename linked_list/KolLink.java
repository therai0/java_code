
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class KolLink {

    void Collec() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(14);
        ll.add(15);
        ll.add(159);
        ll.addLast(44);

        int size = 0;
        Iterator<Integer> itr = ll.iterator();
        while (itr.hasNext()) {
            size += 1;
            System.out.print(itr.next() + "-->");
        }
        System.out.println("null");
        System.out.println("Size: " + size);
        System.out.println(ll.peek());
        // ll.remove();
        Collections.reverse(ll);
        System.out.println(ll.peek());
    }

    // creating the linked list with crash code

    Node head;

    class Node {
        int data;
        Node next;

        Node(int n) {
            this.data = n;
            next = null;
        }
    }

    // adding the element in linkedlist
    //it will add the element in first
    void add(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // adding the element in last
void addLast(int i)
{
    Node newNode = new Node(i);
    if(head == null)
    {
      head = newNode;
            return;   
    }
    Node currentNode = head;
    while(currentNode.next != null)
    {
        currentNode = currentNode.next;
    }
    currentNode.next = newNode;
}
// remove first
void removeFirst()
{
    if(head == null)
    {
        System.out.println("Empty");
        return;
    }
    if(head.next == null)
    {
        head = null;
        return;
    }
    head = head.next;
}

// remove last;
void removeLast()
{
  if(head == null)
    {
        System.out.println("Empty");
        return;
    }
    if(head.next == null)
    {
        head = null;
        return;
    }
    Node firstNode = head.next;
    Node secondNode = head;
    
    while(firstNode.next != null)
    {
        firstNode = firstNode.next;
        secondNode = secondNode.next;
    }
    secondNode.next = null;
}
// print data
void printData()
{
    if(head == null)
    {
        System.out.println("Empty");
        return;
    }
    if(head.next == null)
    {
       System.out.println(head.data);
        return;
    }
    Node current = head;
    while(current != null)
    {
        System.out.print(current.data + "-->");
        current = current.next;
    }
    System.out.println("null");
}

// revers the linked list
void reverse()
{
   if(head == null && head.next == null)
   {
    return;
   } 
   Node prev = head;
   Node curNode = head.next;
   while(curNode != null)
   {
    Node next = curNode.next;
    // updating 
    curNode.next = prev;
    prev = curNode;
    curNode = next;
   }
   head.next = null;
   head = prev;
}

    public static void main(String ar[]) {
        KolLink obj = new KolLink();
        obj.Collec();
        
        // adding the element
        // obj.add(12);
        // obj.add(11);
        // obj.add(10);
        // obj.addLast(90);
        // obj.removeFirst();
        // obj.removeLast();
        // obj.printData();
    }
}
