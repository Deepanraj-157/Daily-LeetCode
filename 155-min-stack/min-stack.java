class MinStack {

    Stack<Integer> minSt;
    Stack<Integer> st;
    public MinStack() {
        minSt=new Stack();
        st=new Stack();
    }
    public void push(int value) {
        if(minSt.isEmpty()) minSt.push(value);
        else{
            if(!minSt.isEmpty()){
                if(minSt.peek()>=value){
                    minSt.push(value);
                }
            }
        }
        st.push(value);
        
    }
    
    public void pop() {
        if(!st.isEmpty() && !minSt.isEmpty()) 
            if(st.peek().equals(minSt.peek()))minSt.pop();
        st.pop();
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {

        return minSt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */