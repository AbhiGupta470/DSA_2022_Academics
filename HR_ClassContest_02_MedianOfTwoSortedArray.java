import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int[] nums1 = new int[input1];
        for(int k = 0;k<nums1.length;k++)
        {
            nums1[k] = sc.nextInt();
        }
        int input2 = sc.nextInt();
        int[] nums2 = new int[input2];
        for(int k =0;k<nums2.length;k++)
        {
            nums2[k] = sc.nextInt();
        }
        int[] new_array = new int[nums1.length+nums2.length];
      int size = 0;
      for (int i = 0; i < nums1.length; i++) {
          new_array[size]=nums1[i];
          size++;
      }
      for (int i = 0; i < nums2.length; i++) {
          new_array[size] = nums2[i];
          size++;
      }
      Arrays.sort(new_array);
      if(new_array.length%2!=0)
      {
          System.out.println(new_array[new_array.length/2]);
      }
      else
      {
          System.out.println((new_array[new_array.length/2]+ new_array[(new_array.length/2)-1])/2);
      }
    }
}
