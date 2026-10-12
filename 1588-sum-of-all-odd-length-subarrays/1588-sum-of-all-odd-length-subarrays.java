class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int  totalSum =0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            int totalSubarrys=(i+1)*(n-i);
            int oddSubarrays=(totalSubarrys+1)/2;
            totalSum+=arr[i]*oddSubarrays;
        }
        return totalSum;
    }
}