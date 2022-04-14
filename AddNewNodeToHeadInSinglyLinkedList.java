// Adding a new node to head in singly linkedlist and displaying the singly linkedlist 
package LinkedListSectionL;

import java.util.Scanner;

public class SelfLinkedListPractice {
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static Node AddToLast(Node head,int data)
    {
        Node new_node = new Node(data);
        new_node.next= null;
        if(head==null)
            head=new_node;
        else
        {
            Node last = head;
            while(last.next!=null)
                last = last.next;
            last.next = new_node;
        }
        return head;
    }


    static Node AddNewNodeToHead(Node head,int data)
    {
        Node new_node = new Node(data);
        new_node.next=null;
        Node temp = head;
        new_node.next = temp;
        head = new_node;
        return head;
    }
    static void PrintSinglyLinkedList(Node head)
    {
        Node traverse_Node = head;
        System.out.println("Elements in the linkedlist are:");
        while(traverse_Node!=null)
        {
            System.out.print(traverse_Node.data+"-> ");
            traverse_Node = traverse_Node.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head=null;
        System.out.println("Enter the size of the linkedlist");
        int size = sc.nextInt();
        System.out.println("Start entering elements in the linkedlist");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter data in the linkedlist: ");
            int data = sc.nextInt();
            head = AddToLast(head,data);
        }
        head = AddNewNodeToHead(head,76);// Actual Step Performed
        PrintSinglyLinkedList(head);
    }
}
