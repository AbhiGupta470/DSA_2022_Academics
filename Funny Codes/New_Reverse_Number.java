/* Finding the reverse of a number in new way, not the traditional approach */
/* Not preferable to use this code anywhere because it is bad cannot understand it in one go*/
import java.util.Scanner;
public class Main 
{
    public static int firstDigit(int number)
    {
        while(number >= 10)
        {
            number = number / 10;
        }
        return number;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int rev = 0;
        int i = 0;
        int numberLength = (number + "").length();
        if(numberLength > 1 && number != 10)
        {
          while((rev+"").length() != numberLength)
          {
            int digit = firstDigit(number);
            rev = digit * (int)Math.pow(10, i) + rev;
            i+=1;
            if((number+"").length() == 2 || (number + "").length() == 3)
            {
                number = number % (digit * 10);
            } else {
                number = number % (digit * Integer.parseInt("1" + "0".repeat((number+"").length() - 1)));
            }
          }
          
          System.out.print(rev);
        } else if(numberLength  == 1)
        {
            System.out.print(number);
        } else if (number == 10)
        {
            System.out.print("01");
        }
      
        
    }
}
