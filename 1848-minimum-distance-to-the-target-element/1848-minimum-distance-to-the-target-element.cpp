class Solution {
public:
    int getMinDistance(vector<int>& nums, int target, int start) {
        int mindistance = INT_MAX;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==target){
                int distance = abs(i-start);
                mindistance = min(mindistance, distance);

            }
        }
        return mindistance;
    }
};