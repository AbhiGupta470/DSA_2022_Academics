package LinkedListSectionL;


public class FirstAndLastOccurenceInArrayUsingRecursion {
    static void IterativeOccurenceFinder(int[] arr,int target)
    {
        int count = 0,store = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
                if(count==0)
                {
                    System.out.println("First Occurence:"+i);
                    count++;
                }
                else
                store = i;
            }
        }
        System.out.println("Last Occurence:"+store);
    }
    static int FindFirstOccurenceRecursively(int[] arr,int first_index,int target)
    {
        if(first_index==arr.length-1) // Base case
            return -1; // returns -1 if the element is not found in the array
        else if(arr[first_index]==target)
            return first_index;
        first_index++;
        return FindFirstOccurenceRecursively(arr,first_index,target);
    }
    static int FindLastOccurenceRecursively(int[] arr,int last_index,int target)
    {
        if(last_index==-1) // Base case
            return -1; // return -1 if the element is not find in the array
        else if(arr[last_index]==target)
            return last_index;
        last_index--;
        return FindFirstOccurenceRecursively(arr,last_index,target);
    }
    public static void main(String[] args) {
        int target = 20;
        int[] arr = {10, 20, 30, 20, 40};
       //IterativeOccurenceFinder(arr,target);
        int first_index = 0;
        System.out.println("First Occurence is:"+FindFirstOccurenceRecursively(arr,first_index,target));
        System.out.println("Last Occurence is:"+FindLastOccurenceRecursively(arr,arr.length-1,target));
    }
}
