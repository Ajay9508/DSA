class Solution {
    public boolean detectCapitalUse(String word) {
        int  cplt_count=0;
        for(char ch:word.toCharArray()){
           if (Character.isUpperCase(ch)) {
             cplt_count++;
            }
            }
        return cplt_count == word.length() || 
               cplt_count == 0 || 
               (cplt_count == 1 && Character.isUpperCase(word.charAt(0)));
    }
}