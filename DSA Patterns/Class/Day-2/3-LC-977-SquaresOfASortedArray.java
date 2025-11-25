/*
  Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
  Input: nums = [-4,-1,0,3,10]
  Output: [0,1,9,16,100]
  Explanation: After squaring, the array becomes [16,1,0,9,100].
  After sorting, it becomes [0,1,9,16,100].
*/

// third easy question of Day-2 in the class 
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int k = nums.length - 1;

        int i = 0, j = nums.length - 1;
        while(i <= j)
        {
            if(Math.abs(nums[i]) > Math.abs(nums[j]))
            {
                res[k] = nums[i] * nums[i];
                i+=1;
            } else {
                res[k] = nums[j] * nums[j];
                j-=1;
            }
            k-=1;
        }
        return res;
    }
}
