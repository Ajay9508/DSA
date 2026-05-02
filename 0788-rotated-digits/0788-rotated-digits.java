class Solution {
     boolean isRight(int n){
        boolean right = false;
        int temp = n;
        while(temp>0){
            int t= temp%10;
             if(t==3|| t==7 || t==4){
                 return false;
             }
           else if(t==2|| t==5||t==6||t==9)
                right = true;
                temp/=10;
        }
        return right;
    }
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(isRight(i)){
                count++;
            }
        }
        return count;
    }
    
   
}