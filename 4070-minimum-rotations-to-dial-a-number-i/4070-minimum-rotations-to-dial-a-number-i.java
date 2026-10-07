class Solution {
    public int minRotations(String s) {
       int totalRotations =0;
        int currentDigit =0;
        for(char ch : s.toCharArray()){
            int targetDigit = ch-'0';
            int diff = Math.abs( targetDigit-currentDigit);
            int  rotation = Math.min(diff,10-diff);
            totalRotations+=rotation;
            currentDigit = targetDigit;
        }
        return totalRotations;
    }
}