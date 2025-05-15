// Selection Sort

public class Main 
{
    // one liner code for Swapping values
    static void Swap(int[] arr, int i, int j)
    {
        arr[i] = arr[j] + arr[i] - (arr[j] = arr[i]);
    }
    public static void main (String[] args) {
        int[] arr = {3,5,1,6,2};
        for(int i=0; i<arr.length; i++)
        {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for(int j=i+1; j<arr.length; j++)
            {
                if(min > arr[j])
                {
                    min = arr[j];
                    index = j;
                }
            }
            if(min < arr[i])
            {
                Swap(arr, i, index);
            }
        }
        for(int ele: arr)
        System.out.print(ele+ " ");
    }    
}

