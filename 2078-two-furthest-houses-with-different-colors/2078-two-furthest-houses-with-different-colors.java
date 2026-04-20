class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int index=0;
        for(int j=n-1;j>=0;j--){ //case 82
            if(colors[0]!=colors[j]){
                index =Math.max(index,j);
                break;
            }
        }
        for(int i=0;i<n;i++){ //case81
            if(colors[n-1]!=colors[i]){
                index= Math.max(index,(n-1)-i);
                break;
            }
        }
        return index;
    }
}