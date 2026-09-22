class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int  n1=arr1.length;
        int  n2=arr2.length;
        // int [] ans = new int[n];
        int count =0;
        for(int i=0;i<n2;i++){
            for(int j=0;j<n1;j++){
                if(arr2[i]==arr1[j]){
                  int temp = arr1[count];
                    arr1[count] = arr1[j];
                    arr1[j] = temp;
                    count++;
                }
            }
        }
        Arrays.sort(arr1, count, n1);
        return arr1;
    }
}