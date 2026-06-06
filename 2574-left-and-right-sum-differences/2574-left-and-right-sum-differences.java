class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int left =0,right=0;
        for(int num : nums){
            right+=num; //totalsum
        }
        for(int i=0;i<n;i++){
            right-=nums[i];
            answer[i]=Math.abs(left-right);
            left+=nums[i];
        }
        return answer;
        
    }
}