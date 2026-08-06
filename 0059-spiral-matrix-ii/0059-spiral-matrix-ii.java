class Solution {
    public int[][] generateMatrix(int n) {
       int[][]matrix = new int [n][n];
      
        int top=0;
        int bottom =n-1;
        int left = 0;
        int right = n-1;
        int num=1;
       
        while(top<= bottom && left<= right){
            //left ->right
            for(int j=left;j<=right;j++){
                matrix[top][j]= num++;
            }
            top++;
            //top ->bottom
            for(int i=top;i<=bottom;i++){
                matrix[i][right]=num++;
            }
            right--;
            //right ->left
            if(top<=bottom){
                for(int k=right;k>=left;k--){
                    matrix[bottom][k]=num++;
                }
                bottom--;
            }
            //bottom ->top
            if(left<= right){
                for(int l=bottom;l>=top;l--){
                    matrix[l][left]=num++;
                }
                left++;
            }
        }
        return matrix;

    }
}
