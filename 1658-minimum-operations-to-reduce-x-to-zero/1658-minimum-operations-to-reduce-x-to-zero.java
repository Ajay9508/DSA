class Solution {
    public int minOperations(int[] nums, int x) {
        int n= nums.length;
        int totalsum=0;  
        for(int num : nums){
            totalsum+=num;
        }
       int  target=totalsum-x;
        if(target==0) return n;
        if(target<0)return -1;
        int maxlength = -1;
        int currentsum=0;
        int left =0;
        for(int  i=0;i<n;i++){
            currentsum +=nums[i];
            while(currentsum>target && left<=i){
                currentsum -= nums[left];
                left++;
            }
            if(currentsum == target){
                maxlength= Math.max(maxlength,i-left+1);
            }
        }
        return maxlength ==-1?-1:nums.length-maxlength;
    }
}