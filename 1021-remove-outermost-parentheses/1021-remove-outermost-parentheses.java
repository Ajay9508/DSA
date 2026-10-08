class Solution {
    public String removeOuterParentheses(String s) {
       StringBuilder sc = new StringBuilder();
       int balance =0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(balance>0)
                  sc.append(ch);
                // stack.push(ch);
                balance++;
            }else{
                balance--;
                if(balance>0)
                    sc.append(ch);
            }
        }
        return sc.toString();
    }
}