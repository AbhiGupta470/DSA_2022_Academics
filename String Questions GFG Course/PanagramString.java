package LinkedListSectionL;

import java.util.Scanner;

public class PanagramChecking {
    static boolean CheckPanagram(String str)
    {
        boolean[] arr = new boolean[26];
        int index;
        for (int i = 0; i < str.length(); i++) {
        if(str.charAt(i)>='a' && str.charAt(i)<='z')
        {
            index = str.charAt(i)-'a';
            arr[index] = true;
        }
        else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
        {
            index = str.charAt(i)-'A';
            arr[index] = true;
        }
        else
            continue;

        }
        for (int i = 0; i < 26; i++)
            if(arr[i]==false)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean res = CheckPanagram(str);
        if(res==true)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
