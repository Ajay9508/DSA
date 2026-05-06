class Solution {
public:
    vector<vector<char>> rotateTheBox(vector<vector<char>>& boxGrid) {
        int row = boxGrid.size();
        int col = boxGrid[0].size();
        for(int i=0;i<row;i++){
            int empty_pos =col-1;
            for(int j=col-1;j>=0;j--){
                if(boxGrid[i][j]=='*'){
                    empty_pos =j-1;
                }else if(boxGrid[i][j]=='#'){
                    boxGrid[i][j]='.';
                    boxGrid[i][empty_pos]='#';
                    empty_pos--;
                }
            }
        }
        vector<vector<char>> rotated(col,vector<char>(row));
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                rotated[j][row-1-i] = boxGrid[i][j];

            }
        }
        return rotated;
        
    }
};