import java.util.*;

// Problem Statement - Given an array of vertical lines, find the two lines that can trap the 
// most water
// here I have implemented Two Pointers to reduce the time complexity from O(n2) to O(n)
public class Main 
{
    public static void main(String... args)
    {
        // leetcode - 11 ( Medium )  - Container with most water
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int start = 0;
        int end = arr.length - 1;
        int maxarea = 0;
        while(start <= end)
        {
            maxarea = Math.max(maxarea, (end - start) * Math.min(arr[start], arr[end]));
            if(arr[start] < arr[end])
            {
                start++;
            } else {
                end -= 1;
            }
        }
        
        System.out.print(maxarea + " ");
    }
}
