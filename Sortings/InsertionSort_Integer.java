// Insertion Sort - For Integer values

public class Main 
{
    
    public static void main (String[] args) {
        int[] arr = {5, 3, -7, 4, 8, 2};
        for(int i=1;  i<arr.length; i++) 
        {
            int item = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > item)
            {
                arr[j+1] = arr[j];
                j-=1;
            }
            j+=1;
            arr[j] = item;
        }
        
        for(int ele: arr)
            System.out.print(ele + " ");
    }
}
