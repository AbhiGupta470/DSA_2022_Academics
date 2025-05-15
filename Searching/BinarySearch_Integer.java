// Binary Search - For Integer Values
// printing the index of the target if found in the array

import java.util.Arrays;
public class Main 
{
    public static void main (String[] args) {
        int[] arr = {3,5,6,2,4}; // 2,3,4,5,6
        int target = 5;
        
        // Sorting the array, because Binary Search works only for sorted array
        Arrays.sort(arr);
        
        int low = 0;
        int high = arr.length - 1;
        
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            
            if(arr[mid] == target)
            {
                System.out.print(mid);
                break;
            } else if(arr[mid] > target)
            {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
    }
}
