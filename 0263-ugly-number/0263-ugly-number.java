class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        for(int fact:new int[]{2,3,5}){
            while(n%fact==0){
                n/=fact;
            }
        }
        return n==1;
    }
}