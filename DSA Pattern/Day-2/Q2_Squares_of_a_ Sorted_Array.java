// Easy 
// Leetcode : 977 - Squares of a Sorted Array
// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int k = ans.length - 1;

        while (left <= right)
        {
            int leftSquare = Math.abs(nums[left] * nums[left]);
            int rightSquare = Math.abs(nums[right] * nums[right]);

            if(rightSquare > leftSquare)
            {
                ans[k] = rightSquare;
                right--;
                k--;
            } else {
                ans[k] = leftSquare;
                left++;
                k--;
            }
        }
        return ans;
    }
}
