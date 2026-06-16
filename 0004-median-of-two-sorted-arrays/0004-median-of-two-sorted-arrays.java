class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] margeArray = new int[nums1.length + nums2.length];
     System.arraycopy(nums1,0,margeArray,0,nums1.length);
     System.arraycopy(nums2,0,margeArray,nums1.length,nums2.length);
     Arrays.sort(margeArray);
     int n = margeArray.length;
     double median;
     if(n%2==1){
            median = margeArray[n/2];
     }else{
        median = (margeArray[n/2-1]+margeArray[n/2])/2.0;
     }
     return median;

    }
}