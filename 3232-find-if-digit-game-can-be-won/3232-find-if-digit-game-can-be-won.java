class Solution {
    public boolean canAliceWin(int[] nums) {
        int Alice =0;
        int Bob=0;
        for(int num :nums){
            if(num>9){
                Bob+=num;
            }else{
                Alice+=num;
            }
        }
        if(Alice==Bob){
            return false;
        }
        return true;
    }
}