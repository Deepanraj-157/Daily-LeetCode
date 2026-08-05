class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        String res="";
        for(char c:s.toCharArray()){
            if(st.isEmpty()){
                st.push(c);
            }
            else{
                if(c=='(') st.push(c);
                else {
                    if(st.peek()=='('){
                        st.pop();
                    }
                }
                if(!st.isEmpty()) res+=c;
            }
        }
        return res;
        
    }
}