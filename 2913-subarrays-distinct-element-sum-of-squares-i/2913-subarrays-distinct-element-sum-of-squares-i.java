class Solution {
    public int sumCounts(List<Integer> nums) {
        int totalSum=0;
        int n= nums.size();
        for(int i=0;i<n;i++){
            HashSet<Integer>list = new HashSet<>();
            for(int j=i;j<n;j++){
                list.add(nums.get(j));
                int dCount = list.size();
                totalSum +=dCount*dCount;
            }
        }
        return totalSum;
    }
}