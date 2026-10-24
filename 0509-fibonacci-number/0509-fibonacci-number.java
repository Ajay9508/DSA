class Solution {
    private static int Dfibo(int n,int[]dp){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        dp[n] = Dfibo(n-1,dp)+Dfibo(n-2,dp);
        return dp[n];
    }
    public int fib(int n) {
        //using dp 
        int [] dp = new int  [n+1];
        Arrays.fill(dp,-1);
        return Dfibo(n,dp);
       
    }
}