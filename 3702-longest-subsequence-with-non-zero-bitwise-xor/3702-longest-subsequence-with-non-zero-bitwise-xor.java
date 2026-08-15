class Solution {
    public int longestSubsequence(int[] nums) {
        int n= nums.length;
        int xor =0;
        boolean NonZero=false;
        for(int num:nums){
            xor=xor^num;
            if (num != 0) {
                NonZero = true;
            }
                // ans = Math.max(ans,count);
        }
        if(!NonZero){
            return 0;
        }
        if(xor!=0){
            return nums.length;
        }
        return nums.length-1;
    }
}