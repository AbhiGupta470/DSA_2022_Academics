// Creating two linkedlist and printing them
import javax.sound.sampled.Line;

public class LinkedListMyImplementation {
    Node head1;
    Node head2;
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    public LinkedListMyImplementation insert1(int data,LinkedListMyImplementation list1)
    {
        // Case-1 When the linkedlist is empty
        Node new_node = new Node(data);
        new_node.next = null;
        if(head1==null)
        {
            head1 = new_node;
        }
        // Case-2 Insertion at the end
        else
        {
            Node last = head1;
            while(last.next!=null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
        return list1;
    }
    public static void printList1(LinkedListMyImplementation list1)
    {
        Node traverseNode = list1.head1;
        System.out.print ("LinkedList1 is: ");
        while (traverseNode!=null)
        {
            System.out.print(traverseNode.data+" ");
            traverseNode = traverseNode.next;
        }
    }
    public LinkedListMyImplementation insert2(int data,LinkedListMyImplementation list2)
    {
        // When the linkedlist is empty
        Node new_node1 = new Node(data);
        new_node1.next=null;
        if(head2==null)
        {
            head2 = new_node1;
        }

        // Insertion at the end
        else
        {
            Node last1 = head2;
            while(last1.next!=null)
            {
                last1 = last1.next;
            }
            last1.next = new_node1;
        }
        return list2;
    }
    public static void printList2(LinkedListMyImplementation list2)
    {
        Node traverseNode1 = list2.head2;
        System.out.println("");
        System.out.print("LinkedList2 is: ");
        while (traverseNode1!=null)
        {
            System.out.print(traverseNode1.data+" ");
            traverseNode1 = traverseNode1.next;
        }
    }
    /*public LinkedListMyImplementation MergingLinkedLists(LinkedListMyImplementation list3)
    {
        Node last3 = head1;
        while(last3.next!=null)
        {
            last3 = last3.next;
        }
        last3.next = list3.head2;
        return list3;
    }
    public void printList3(LinkedListMyImplementation list3)
    {
        Node traverseList3 = list3.head1;
        System.out.println("");
        System.out.print("LinkedList3 is: ");
        while(traverseList3!=null)
        {
            System.out.print(traverseList3.data+" ");
            traverseList3 = traverseList3.next;
        }
    }*/
    public static void main(String[] args) {
        LinkedListMyImplementation list1 = new LinkedListMyImplementation();
        LinkedListMyImplementation list2 = new LinkedListMyImplementation();
        LinkedListMyImplementation list3 = new LinkedListMyImplementation();
        list1 = list1.insert1(1,list1);
        list1 = list1.insert1(2,list1);
        list2 = list2.insert2(3,list2);
        list2 = list2.insert2(4,list2);
        printList1(list1);
        printList2(list2);
        //list3.printList3(list3);
        System.out.println("Minutes: "+System.currentTimeMillis()/1000/60);
    }
}
