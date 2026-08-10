class Solution {
    public int lengthOfLongestSubstring(String s) {
       int max=0;
       int left=0;
       int[] lastseen =new int[128];

       for(int i=0;i<s.length();i++){
       char c =s.charAt(i);
            left = Math.max(left,lastseen[c]);
            max = Math.max(max,i-left+1);
            lastseen[c] = i+1;
       } 
       return max;
    }
}
