class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int first=0;
        int end = nums.size()-1;
        while(first<=end){
            int mid = first+(end-first)/2;
            if(nums[mid]<target){
                first=mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else
            return mid;
        }
        return first;
    }
};