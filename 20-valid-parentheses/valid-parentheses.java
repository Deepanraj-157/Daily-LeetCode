class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if( c == '(' || c == '[' || c == '{') st.push(c);
            else{
                switch(c){
                    case ')':{
                        if(st.isEmpty()) return false;
                        if(st.peek()!='(') return false;
                        st.pop();
                        break;
                    }
                    case '}':{
                        if(st.isEmpty()) return false;
                        if(st.peek()!='{') return false;
                        st.pop();
                        break;
                    }
                    case ']':{
                        if(st.isEmpty()) return false;
                        if(st.peek()!='[') return false;
                        st.pop();
                        break;
                    }
                    default:
                        break;
                }
            }
        }
        if(!st.isEmpty()) return false;
        return true;
        
    }
}