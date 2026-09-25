import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> Ht = new HashMap<>();
        Ht.put('I', 1);
        Ht.put('V', 5);
        Ht.put('X', 10);
        Ht.put('L', 50);
        Ht.put('C', 100);
        Ht.put('D', 500);
        Ht.put('M', 1000);
        int total=0;
        int n= s.length();
        for(int i=0;i<n;i++){
           int curr = Ht.get(s.charAt(i));
            if(i<n-1 && curr < Ht.get(s.charAt(i + 1))){
                total-=curr;
            }else{
                total+=curr;
            }
        }
        return total;
    }
}