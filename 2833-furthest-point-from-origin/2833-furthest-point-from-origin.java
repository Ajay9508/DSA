class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int lcount=0;
        int rcount=0;
        int dashcount=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L'){
                lcount++;
            }else if(ch == 'R'){
                rcount++;
            }else{
                dashcount++;
            }
        }
        return Math.abs(lcount-rcount)+dashcount;
    }
}