import java.util.*;
class Solution {
    public int numberOfSpecialChars(String word) {
        int lastLower[] = new int[26];
        int firstUpper[] = new int [26];
       java.util.Arrays.fill(lastLower,-1);
       java.util.Arrays.fill(firstUpper,-1);
        for(int i=0;i<word.length();i++){
            char ch =word.charAt(i);
            if(Character.isLowerCase(ch)){
                lastLower[ch-'a']=i;
            }else{
                int index= ch-'A';
                if(firstUpper[index] ==-1){
                    firstUpper[index]=i;
                }
            }
        }
        int specialCount =0;
        for(int i=0;i<26;i++){
            if( firstUpper[i]!=-1 &&lastLower[i]!=-1 && lastLower[i]<firstUpper[i]){
                specialCount++;
            }
        }
        return specialCount;
    }
}