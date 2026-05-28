class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        int[] Countchar = new int[26];
        for(int i=0;i<magazine.length();i++){
            Countchar[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            int index = ransomNote.charAt(i)-'a';
            Countchar[index]--;
        if(Countchar[index]<0){
            return false;
        }
        }
        return true;
    }
}