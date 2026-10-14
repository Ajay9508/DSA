class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum<0 ||sum>(long)num*9){
            return "";
        }
        int[] res = new int[num];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<num;i++){
            int remPos = num - i - 1;
            int digit=Math.min(9,sum-remPos);
            int mindigit = Math.min(0,sum-remPos*9);
            int maxdigit = Math.min(9,sum);
            // if(digit<0) digit=0;
           res[i]=maxdigit;
            sum-=maxdigit;
        }
        for(int n : res){
            sb.append(n);
        }
      return sb.toString();
    }
}