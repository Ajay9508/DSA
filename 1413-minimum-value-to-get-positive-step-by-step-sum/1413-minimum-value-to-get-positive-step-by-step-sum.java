class Solution {
    public int minStartValue(int[] nums) {
        int minv=0;
        int currv=0;
        for(int num:nums){
            currv+=num;
            minv = Math.min(minv,currv);
        }
        return 1-minv;

    }
}