class Solution {
public:
    int jump(vector<int>& nums) {
        int n= nums.size();
        int start =0,current_end=0;
        int jumps =0;
        for(int i=0;i<n-1;i++){
            start = max(start,i+nums[i]);
                if(i== current_end){
                    jumps++;
                    current_end = start;
                }
        }
        return jumps;

    }
};