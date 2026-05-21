class Solution {
    public String reverseStr(String s, int k) {
        char [] str = s.toCharArray();
        for(int i=0;i<str.length;i+=2*k){
            int start =i;
            int end = Math.min(i+k-1,str.length-1);
            while(start<end){
                char temp = str[start];
                str[start]=str[end];
                str[end] = temp;
                start++;end--;
            }
        
        }
        return new String(str);
    }
}