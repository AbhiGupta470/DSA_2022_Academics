// Easy 
// Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory.
// 344. Reverse String
class Solution {
    public void Swap(int left, int right, char[] s)
    {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left < right)
        {
            Swap(left, right, s);
            left++;
            right--;
        }
    }
}
