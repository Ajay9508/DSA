class Solution {
    public int numDistinct(String s, String t) {
        int m= s.length();
        int n= t.length();
        int []count= new int[n+1];
        count[0] = 1;
        for(int i=1;i<=m;i++){
            for(int j=n;j>=1;j--){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    count[j]+=count[j-1];
                }
            }
        }
        return count[n];
    }
}