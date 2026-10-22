class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String ch :operations){
            if(ch.equals("+")){
                int top =st.pop();
                int newtop = top+st.peek();
                st.push(top);
                st.push(newtop);
            }else if(ch.equals("D")){
                st.push(2*st.peek());
            }else if(ch.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
            int totalSum =0;
            for(int num : st){
                totalSum+=num;
            }  
            return totalSum;    
    }
}