class Solution {
    public int distinctSubseqII(String s) {
        int n =s.length();
        int mod=1_000_000_007;
        int [] last = new int[26];
        Arrays.fill(last, -1);
        int [] dp = new int[n+1];
         dp[0]=1;
        for(int i=1;i<=n;i++){
            char ch =s.charAt(i-1);
            int index = ch-'a';
            dp[i]=(2*dp[i-1])%mod;
            if (last[index] != -1){
                dp[i]=(dp[i]-dp[last[index]-1]+mod)%mod;
            }
            last[index]=i;
        }
        return (dp[n]-1+mod)%mod;
    }
}