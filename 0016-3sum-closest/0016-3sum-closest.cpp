class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        int n= nums.size();
        int close = nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            int start=i+1,end=n-1;
            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                int Ndiff = sum-target;
                if(Ndiff<0){
                    Ndiff= -Ndiff;
                }
                int Odiff = close -target;
                if(Odiff<0){
                    Odiff= -Odiff;
                }
                if(Ndiff<Odiff){
                    close = sum;
                }
                if(sum >target){
                    end--;
                }else if(sum<target){
                    start++;
                }else
                return sum;
            }
        }
        return close;
    }
};