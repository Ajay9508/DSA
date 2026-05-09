class Solution {
public:
    vector<vector<int>> rotateGrid(vector<vector<int>>& grid, int k) {
        // vector<vector<int>> temp;
        int m=grid.size(); //order m
        int n= grid[0].size(); //order n
        int l = min(m,n)/2; // no of layer 
        for(int i=0;i<l;++i){
            vector<int> temp;
            for(int j=i;j<n-i;++j){
                temp.push_back(grid[i][j]);// top row;
            }
            for(int k =i+1;k<m-i-1;++k){
                temp.push_back(grid[k][n-i-1]); //right column
            }
            for(int j=n-i-1;j>=i;--j){
                temp.push_back(grid[m-i-1][j]); //bottom row
            }
            for(int k =m-i-2;k>i;--k){
                temp.push_back(grid[k][i]); //left column
            }
            //Elements ko wapas dalo shifted index ke saath
            int len = temp.size();
            if (len == 0) continue;
            int shift = k % len;
            int s =shift; //s index
             for(int j=i;j<n-i;++j){
                grid[i][j]=temp[s++%len];
            }
            for(int k =i+1;k<m-i-1;++k){
                grid[k][n-i-1]=temp[s++%len]; //right column
            }
            for(int j=n-i-1;j>=i;--j){
                grid[m-i-1][j]=temp[s++%len]; //bottom row
            }
            for(int k =m-i-2;k>i;--k){
                grid[k][i]=temp[s++%len]; //left column
            }

        }

    return grid; //return in grid
    }
};