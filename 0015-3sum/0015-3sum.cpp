class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ans;
        int n = nums.size();
         sort(nums.begin(),nums.end());
        for(int i=0;i<n-2;i++){
            int start = i+1,end = n-1;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum == 0){
                    // vector<int>temp={nums[i],nums[start],nums[end]};
                    // sort(temp.begin(),temp.end());
                    // if(find(ans.begin(),ans.end(),temp)==ans.end()){ 
                    //     // remove dublicate
                    //     ans.push_back(temp);
                    // }
                        ans.push_back({nums[i],nums[start],nums[end]});
                     while(start < end && nums[start]==nums[start+1]) start++;
                    while(start < end && nums[end]==nums[end-1]) end--;
                    start++;
                    end--;
                }else if(sum>0)
                {
                    end--;
                }else
                start++;
            }
            // for(int j=i+1;j<n;j++){
                // for(int k=j+1;k<n;k++){
                //     if(nums[i]+nums[j]+nums[k]==0){
                //         vector<int> result={nums[i],nums[j],nums[k]};
                //         sort(result.begin(),result.end());
                //         if(find(ans.begin(),ans.end(),result)==ans.end()){
                //         ans.push_back(result);
                //         }
                //     }
                // }
            // }

        }
        return ans;
    }
};