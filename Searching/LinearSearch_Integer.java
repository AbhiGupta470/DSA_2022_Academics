// Linear Search - For Integer Values
// printing the index of the target if found in the array

public class Main 
{
    public static void main (String[] args) {
        int[] arr = {3,5,6,2,4}; 
        int target = 5;
        
        for(int i=0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                System.out.print(i + " ");
                break;
            }
        }
    }
}
