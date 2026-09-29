class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String c:tokens){
            
            if (!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")) {
                int num=Integer.parseInt(c);
                st.push(num);
            }
            else{
                int b=st.pop();
                int a=st.pop();
                if (c.equals("+")) {
                    st.push(a + b);
                }
                else if (c.equals("-")) {
                    st.push(a - b);
                }
                else if (c.equals("*")) {
                    st.push(a * b);
                }
                else if (c.equals("/")) {
                    st.push(a / b);
                }
            }
        }
        return st.peek();

        
    }
}