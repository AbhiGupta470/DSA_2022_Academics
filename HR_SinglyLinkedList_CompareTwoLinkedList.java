import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode traverse_Node1 = head1;
        SinglyLinkedListNode traverse_Node2 = head2;
        int count1 = 0,count2 = 0;
        while(traverse_Node1!=null)
        {
            count1+=1;
            traverse_Node1 = traverse_Node1.next;
        }
        while(traverse_Node2!=null)
        {
            count2+=1;
            traverse_Node2 = traverse_Node2.next;
        }
        traverse_Node1 = head1;
        traverse_Node2 = head2;
        int flag =1;
       if(count1==count2)
       {
           while(traverse_Node1!=null && traverse_Node2!=null)
           {
               if(traverse_Node1.data==traverse_Node2.data)
               flag=1;
               else
               flag=0;
               traverse_Node1 = traverse_Node1.next;
               traverse_Node2 = traverse_Node2.next;
           }
           if(flag==1)
           return true;
           else
           return false;
       }
       else
       return false;

    }

    private static final Scanner scanner = new Scanner(System.in);
