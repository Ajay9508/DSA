class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int num=n;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            mul*=digit;
            n/=10;
        }
        int total=sum+mul;
    return(num%total==0);
    }
}