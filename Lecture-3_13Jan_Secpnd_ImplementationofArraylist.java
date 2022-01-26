import java.util.ArrayList;

public class EFTest2 {
    public static void main(String[] args) {
       /* ArrayList<Integer> i = new ArrayList<>();
        i.add(10);
        i.add(20);
        i.add(30);
        i.add(40);
        //System.out.println(i); Output=[10, 20, 30, 40]
        i.add(1,789);
        //System.out.println(i); output = [10, 789, 20, 30, 40]
        i.remove(0);
        //System.out.println(i); output = [789, 20, 30, 40] //Shifting */
        int arr[] = {10,20,30,40,50};
        int index = 1;
        int i=0;
        for(i = index;i<arr.length-1;i++)
        {
            arr[i] = arr[i+1];
        }
       /* for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }*/ //output = 10 30 40 50 50
        arr[i] = 0; //Since the value of i is 4 which is equals to arr.length-1
        for (int k:arr) {
            System.out.print(k+" ");
        } // output  = 10 30 40 50 0
    }
}
