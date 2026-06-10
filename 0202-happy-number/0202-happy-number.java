class Solution {
    public boolean isHappy(int n) {
        int i =0;
        while(n!=1 && i<1000){
            n=getnextsum(n);
            i++;
        }
        return n==1;
    }
    private int getnextsum(int n){
        int t_sum =  0;
        while(n>0){
            int d=n%10;
            t_sum +=d*d;
            n/=10;
        }
        return t_sum;
    }
}