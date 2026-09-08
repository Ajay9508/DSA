class Solution {
    public int countCommas(int n) {
        int ans;
        if(n<999){
            return 0;
        }else{
            ans = n-999;
        }
        return ans;
    }
}