class Solution {
public:
    vector<int> grayCode(int n) {
       vector<int> output;
       int size = 1 << n; //pow(2,n);
       for(int i=0;i<size;i++)
        output.push_back(i^(i>>1));
        return output;
    }
};