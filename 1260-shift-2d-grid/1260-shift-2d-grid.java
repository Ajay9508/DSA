class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m= grid.length;
        int n = grid[0].length;
        int total = m*n;
        k=k%total;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<total;i++){
            int row =i/n;
            int col =i%n;
            if(col ==0){
                result.add(new ArrayList<>());
            }
            int prev1Dindex =(i-k+total)%total;
            int prevRow = prev1Dindex /n;
            int prevcol = prev1Dindex%n;
            result.get(row).add(grid[prevRow][prevcol]);
        }

        return result;
        
    }
}