class Solution {
public:
    int maxRotateFunction(vector<int>& nums) {
         int n = nums.size();
        long long sum = 0, f = 0;
        // Calculate sum of array and F(0)
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            f += (long long)i * nums[i];
        }
        // Use relation to compute F(k)
        long long ans = f;
        long long curr = f;
        for (int k = 1; k < n; k++) {
            curr = curr + sum - (long long)n * nums[n - k];
            ans = max(ans, curr);
        }
        return (int)ans;
    }
};