// Converting a number to its reverse for example: 321 to 123

import java.util.Scanner;

public class Main 
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        
        System.out.println(reverse);
    }
}
