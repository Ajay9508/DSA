class Solution {
    public int[] resultArray(int[] nums) {
        int n =nums.length;
        int[]arr1 =new int[n];
        int[]arr2 =new int[n];
        int len1=0;
        int len2=0;
        arr1[len1++]=nums[0];
        arr2[len2++]=nums[1];
        for(int i=2;i<n;i++){
            if(arr1[len1-1]>arr2[len2-1]){
                arr1[len1++]=nums[i];
            }else{
                arr2[len2++]=nums[i];
            }
        }
        int[] arrys =new int[n];
        System.arraycopy(arr1, 0, arrys, 0, len1);
        System.arraycopy(arr2, 0,arrys, len1, len2);
        return arrys;
    }
}