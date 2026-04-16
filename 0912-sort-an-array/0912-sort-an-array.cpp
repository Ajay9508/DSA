class Solution {
public:
    vector<int> sortArray(vector<int>& nums) {
        int end  = nums.size()-1,start=0;
          void marge(vector<int>&arr,int start,int mid,int end);
          margeSort(nums,start,end);
          return nums;
    }
          private:
        void margeSort(vector<int>&arr,int start,int end){
        if(start==end)
            return;
           int mid = start+(end-start)/2;
           //left subarray
           margeSort(arr,start,mid);
           //right subarray
           margeSort(arr,mid+1,end);
           marge(arr,start,mid,end);
        }
        void marge(vector<int>&arr,int start,int mid,int end){
            vector<int>temp(end-start+1);
            int left = start,right = mid+1,index=0;
            while(left<=mid && right<=end){
                if(arr[left]<=arr[right]){
                    temp[index]=arr[left];
                    index++;
                    left++;
                }else
                {
                    temp[index]=arr[right];
                    index++;
                    right++;
                }
            }
            //left array
            while(left<=mid){
                temp[index]=arr[left];
                index++;
                left++;
            }
            //right array
            while(right<=end){
                temp[index]=arr[right];
                index++;
                right++;
            }
            index=0;
            for(int i=0;i<temp.size();i++){
                 arr[start+i]=temp[i];
            }
            // while(start<=end){
            //     arr[start]=temp[index];
            //     start++;
            //     index++;
            // }
        }
};
