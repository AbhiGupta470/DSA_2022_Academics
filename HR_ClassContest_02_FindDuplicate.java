import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] nums = new int[input];
        for(int k =0;k<nums.length;k++)
        {
            nums[k] = sc.nextInt();
        }
        int flag = 0,i;
        for (i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    flag = 1;
                    break;}
            }
            if(flag==1)
                break;
        }
        if(flag==1)
            System.out.println(nums[i]);
    }
    
}
