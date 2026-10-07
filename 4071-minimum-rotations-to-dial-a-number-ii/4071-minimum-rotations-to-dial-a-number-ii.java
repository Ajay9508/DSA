class Solution {
    public int minRotations(int n, String s) {
        int v =n;
        int[] pref = new int[n+1];
        int curr =0;
        for(int i=0;i<n;i++){
            int  target = s.charAt(i)-'0';
            int diff = Math.abs(target -curr);
            pref[i+1]= pref[i]+Math.min(diff,10-diff);
            curr = target;
        }
        int mintotal = pref[n];
   
        int[] revCost = new int[n + 1];
        for (int i = n - 2; i >= 0; i--) {
            int d1 = s.charAt(i + 1) - '0';
            int d2 = s.charAt(i) - '0';
            int diff = Math.abs(d1 - d2);
            revCost[i] = revCost[i + 1] + Math.min(diff, 10 - diff);
        }
        for(int k=0;k<n;k++){
            int  startdigit =(k==0)?  0: (s.charAt(k-1)-'0');
            int lastdigit =  s.charAt(n-1)-'0';
            int tranDiff = Math.abs(lastdigit - startdigit);
            int tranCost = Math.min(tranDiff,10-tranDiff);
            int totalRotations = pref[k]+tranCost+revCost[k];
            mintotal = Math.min(mintotal,totalRotations);
        }
        return mintotal;
    }
}