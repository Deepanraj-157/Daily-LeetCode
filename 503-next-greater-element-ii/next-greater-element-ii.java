class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int res[]=new int[nums.length];
        int n=nums.length;
        Arrays.fill(res,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n*2;i++){
            int curr=i%n;
            while(!st.isEmpty() && nums[st.peek()]<nums[curr]){
                int index=st.pop();
                res[index]=nums[curr];
            }
            if(i<n){
                st.push(i);
            }
        }
        return res;
        
    }
}