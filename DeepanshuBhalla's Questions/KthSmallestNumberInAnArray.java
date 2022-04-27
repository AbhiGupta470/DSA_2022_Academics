import java.util.Arrays;

public class KthSmallestElementInTheArray {
    static void KthSmallestNumber(int[] arr,int k)
    {
        // Applying Logic Of Sorting
        System.out.println(arr[k-1]);
    }
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        int k = 3;
        Arrays.sort(arr);
        KthSmallestNumber(arr,k);
    }
}
