import java.util.Scanner;

public class Vishal_Problem {
    static void PrintThePositionedNumber(int num,int k)
    {
        int start=0;
        int[] arr = new int[2*num];
        for (int i = 1; i <= num; i++) {
            if(i%2!=0) {
                arr[start] = i;
                start++;
            }
        }
        for (int i = 1; i <= num ; i++) {
            if(i%2==0)
            {
                arr[start] = i;
                start++;
            }
        }
        System.out.println(arr[k-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        PrintThePositionedNumber(num,k);
    }
}
