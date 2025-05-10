// Maximum occurence of a character in a string by HashMap
// Input : "Shubh"
// Output: "h"

import java.util.Scanner;
import java.util.HashMap;

public class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<str.length(); i++)
        {
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        
        int min = Integer.MIN_VALUE;
        char ch = Character.MIN_VALUE; // this is a new concept - Nothing but empty character literal
        for(Character ele: map.keySet())
        {
            if(map.get(ele) > min)
            {
                min = map.get(ele);
                ch = ele;
            }
            
        }
        
        System.out.print(ch);
    }
}
