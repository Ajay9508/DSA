class Solution {
public:
    vector<string> readBinaryWatch(int turnedOn) {
         vector<string> result;
        for(int i=0;i<12;i++){ //hour
            for(int j=0;j<=59;j++){ //minutes
                 if (__builtin_popcount(i) + __builtin_popcount(j) == turnedOn){
                     char buffer[6];
                    sprintf(buffer, "%d:%02d", i, j);
                    result.push_back(string(buffer));
                }
            }
        
        }
        return result;
    }
};