import java.io.*;
import java.util.*;

public class Solution {
        static void KthSmallestNumber(int[] arr,int k)
        {
            System.out.println(arr[k-1]);
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ;i < arr.length ;i++)
           arr[i] = sc.nextInt();
        int k = sc.nextInt();
        Arrays.sort(arr);
        KthSmallestNumber(arr,k);
    }
}
