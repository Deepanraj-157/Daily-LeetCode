class Solution {
    public int maxDepth(String s) {
        int max=Integer.MIN_VALUE;
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            max=Math.max(st.size(),max);
                if(c=='(') st.push(c);
                else{
                    if(c==')'){
                        if(st.peek() == '(') st.pop();
                    }
                }
        }
        return max;
        
    }
}