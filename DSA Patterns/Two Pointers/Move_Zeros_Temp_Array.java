// this is the first and most basic problem related to Two pointer
// this the first soution for this problem
// FYI: I have implemented one more solution
import java.util.Arrays;
public class Main 
{
    // leetcode - 283
    public static void main(String[]args)
    {
        int[] arr = {0, 1, 0, 3, 12, 0};
        // output = 1, 3, 12, 0, 0, 0
        int[] temp = new int[arr.length];
        Arrays.fill(temp, 0);
        int start = 0;
        int end = 0;
        while(end < arr.length) {
            if(arr[end] != temp[start])
            {
                temp[start] = arr[end];
                start++;
            }
            end ++;
        }
        
        
        for(int ele: temp)
        System.out.print(ele + " ");
    }
}
