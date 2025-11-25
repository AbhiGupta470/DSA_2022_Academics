class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while(start <= end)
        {
            char leftCh = s.charAt(start);
            char rightCh = s.charAt(end);

            if(!Character.isLetterOrDigit(leftCh))
            {
                start++;
                continue;
            } 
            if(!Character.isLetterOrDigit(rightCh))
            {
                end--;
                continue;
            }
            if(Character.toLowerCase(leftCh) != Character.toLowerCase(rightCh))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
