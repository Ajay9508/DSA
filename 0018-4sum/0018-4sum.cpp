class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> result;
        int n= nums.size();
        if(n<4) return result;
        sort(nums.begin(),nums.end());
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            // int ans = target - nums[i];
            // int ans1 = ans - nums[i+1];
            for(int j=i+1;j<n-2;j++){
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                long long ans1 = (long long)target - nums[i]-nums[j];
            int start=j+1,end =n-1;
            while(start<end){
                if(nums[start]+nums[end]==ans1){
                    result.push_back({nums[i],nums[j],nums[start],nums[end]});
                    while(start<end && nums[start]==nums[start+1]) start++;
                    while(start<end && nums[end]==nums[end-1]) end--;
                    start++;
                    end--;
                }else if(nums[start]+nums[end]<ans1){
                    start++;
                }else
                end--;
            }
            }
        }
        return result;
    }
};