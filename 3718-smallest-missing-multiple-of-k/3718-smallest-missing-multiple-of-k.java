class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int i=k;
        for(int num:nums){
            if(num==i){
                i+=k;
            }
        }
        return i;
    }
}