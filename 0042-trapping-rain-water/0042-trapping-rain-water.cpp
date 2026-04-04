class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        int leftMax[n],rightMax[n];
        leftMax[0]=0;
        for(int i=1;i<n;i++){
            leftMax[i]=max(leftMax[i-1],height[i-1]);
        }
         rightMax[n-1]=0;
        for(int i=n-2;i>=0;i--){
            rightMax[i]=max(rightMax[i+1],height[i+1]);
        }
        int water=0;
        for(int i=0;i<n;i++){
            int minheight = min(rightMax[i],leftMax[i]);
            int space = minheight-height[i];
            if(space>0){

            water+=space;
            }
        }
        return water;

    }
};