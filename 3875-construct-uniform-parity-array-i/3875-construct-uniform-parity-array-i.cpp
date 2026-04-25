class Solution {
public:
    bool uniformArray(vector<int>& nums1) {
        int oddcount = 0, evencount = 0;
        for (int x : nums1) {
            if (x % 2 == 0) evencount++;
            else oddcount++;
        }
        if (oddcount == nums1.size() || evencount == nums1.size())
            return true;
        return true;
    }
};