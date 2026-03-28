class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int curr_max = nums[0];
       int max_a= nums[0];
       for(int i=1;i<n;i++){
              curr_max = Math.max(nums[i],curr_max+nums[i]);
              max_a = Math.max(max_a,curr_max);
       }
       return max_a;
    }
}