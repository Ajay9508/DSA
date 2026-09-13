//nums[0] < nums[1] > nums[2] < nums[3]....
class Solution {
    public void wiggleSort(int[] nums) {
        int n= nums.length;
        int [] sorted =nums.clone();
        Arrays.sort(sorted);
        int right =n-1;
        int mid = right/2;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                nums[i]=sorted[right--];
            }else{
                nums[i]=sorted[mid--];
            }
        }
    }
}