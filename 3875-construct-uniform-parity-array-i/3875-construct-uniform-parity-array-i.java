class Solution {
    public boolean uniformArray(int[] nums1) {
        int oddcount=0;
        int evencount=0;
        for(int num:nums1){
            if(num%2==0){
                evencount++;
            }
            oddcount++;
        }
        if(oddcount==nums1.length||evencount==nums1.length){
            return true;
        }
        return true;
    }
}