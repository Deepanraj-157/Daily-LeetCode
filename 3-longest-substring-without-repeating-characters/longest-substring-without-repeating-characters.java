class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> q=new LinkedList<>();
        int max=0;
        for(char c:s.toCharArray()){
            if(!q.contains(c)){
                q.offer(c);
                max=Math.max(max,q.size());
            }
            else{
                while(q.contains(c)) q.poll();
                 q.offer(c);
            }
           
        }
        return max;

        
    }
}