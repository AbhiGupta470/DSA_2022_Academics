// Write a program to check whether a given string is palindrome or not using Two Pointer algorithm
// Leetcode 125. Valid Palindrome
// continue keyword act as skip the rest of the code present after the continue and jump to the next iteration of the loop

class Solution {
    public boolean isPalindrome(String s) {
       if(s.isEmpty())
       return true;

       int left = 0;
       int right = s.length() - 1;

       while (left < right)
       {
         char leftCh = s.charAt(left);
         char rightCh = s.charAt(right);


        if(!Character.isLetterOrDigit(leftCh)) {
            left++;
            continue;
        }
        if(!Character.isLetterOrDigit(rightCh)) {
            right--;
            continue;
        }
        if(Character.toLowerCase(leftCh) != Character.toLowerCase(rightCh))
            return false;
        left++;
        right--;
       }
       return true;
    }
}
