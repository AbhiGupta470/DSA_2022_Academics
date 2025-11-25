/* Main requirement of the program
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
*/

// This is the second question of the class
class Solution {
    private void Swap(char[] s, int i, int j)
    {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while(start < end)
        {
            Swap(s, start, end);
            start++ ;
            end-- ;
        }
    }
}
