// Converting Decimal Number to Binary Number - 2 - 1,0
import java.util.Scanner;

public class Main 
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalNumber = sc.nextInt();
        
        int binaryNumber = 0;
        int i = 0;
        while(decimalNumber != 0)
        {
            int remainder = decimalNumber % 2;
            // the below line can convert any number to its reverse
            binaryNumber = remainder * (int)Math.pow(10, i) + binaryNumber; // main logic 
            i+=1;
            decimalNumber =  decimalNumber / 2;
        }
        
        System.out.print(binaryNumber);
    }
}
