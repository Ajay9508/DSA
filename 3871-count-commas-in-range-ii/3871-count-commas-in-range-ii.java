class Solution {
    public long countCommas(long n) {
        long ans=0,few4=1000;
        while(few4<=n){
            ans+=(n-few4+1);
            few4*=1000;
        }
        return ans; 
    }
}