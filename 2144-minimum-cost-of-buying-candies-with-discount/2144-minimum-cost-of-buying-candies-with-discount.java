class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int totalcost =0;
        int n = cost.length;
        for(int i = n-1;i>=0;i--){
            totalcost+= cost[i];
            i--;
            if(i>=0){
                totalcost +=cost[i];
            }
            i--;
        }
        return totalcost;
        
    }
}