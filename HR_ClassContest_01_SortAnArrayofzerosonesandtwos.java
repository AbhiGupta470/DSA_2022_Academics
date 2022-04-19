import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<arr.length;i++)
            arr[i] =sc.nextInt();
        int zero_count = 0,ones_count = 0,twos_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
                zero_count++;
            else if(arr[i]==1)
                ones_count++;
            else if(arr[i]==2)
                twos_count++;
        }
        int start = 0;
        while(zero_count!=0)
        {
            arr[start] = 0;
            zero_count--;
            start++;
        }
        while(ones_count!=0)
        {
            arr[start] = 1;
            ones_count--;
            start++;
        }
        while(twos_count!=0)
        {
            arr[start] = 2;
            twos_count--;
            start++;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
