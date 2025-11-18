import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int start = 0;
		int end = str.length() - 1;
		boolean flag = false;
		while(start <= end)
		{
		    if(str.charAt(start) != str.charAt(end))
		    flag = true;
		    start++;
		    end--;
		}
		if(flag)
		System.out.print("Not a palindrome string.");
		else 
		System.out.print("Palindrome String");
	}
}
