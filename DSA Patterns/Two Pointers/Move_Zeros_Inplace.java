import java.util.Arrays;
public class Main 
{
    public static void Swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // leetcode - 283
    public static void main(String[]args)
    {
        int[] arr = {0, 1, 0, 3, 12, 0};
        int start = 0;
        int end = start;
        while(end < arr.length)
        {
            if(arr[end] != 0)
            {
                Swap(arr, start, end);
                start += 1;
            }
            end ++;
        }
        
        for(int ele: arr)
        System.out.print(ele + " ");
        
    }
}
