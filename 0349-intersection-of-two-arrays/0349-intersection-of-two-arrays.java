class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
        for(int n:nums2){
            if(set1.contains(n)){
                res.add(n);
            }
        }
        int [] arr = new int[res.size()];
        int k=0;
        for(int n:res){
            arr[k++]=n;
        }
        return arr;
    }
}