import java.util.*;

// Problem Statement - Given an array of vertical lines, find the two lines that can trap the 
// most water
// here I have implemented Brute Force Approach
public class Main 
{
    public static void main(String... args)
    {
        // leetcode - 11 ( Medium )  - Container with most water
        int maxarea = 0;
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        for(int i=0; i<arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++)
            {
                int breadth = Math.min(arr[i], arr[j]);
                int length = j - i;
                maxarea = Math.max(maxarea, length * breadth);
            }
        }
        
        System.out.print(maxarea + " ");
    }
}
