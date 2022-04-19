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
        for(int i =0;i<arr.length;i++)
            arr[i] = sc.nextInt();
       int[] new_array = new int[arr.length];
       // Ouptut = {-12 -13 -5 -6 -7 -3 11 5 6}
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                new_array[start] = arr[i];
                start++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0)
            {
                new_array[start] = arr[i];
                start++;
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(new_array[i]+" ");
    }
}
