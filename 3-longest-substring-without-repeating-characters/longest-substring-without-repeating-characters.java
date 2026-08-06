class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> q=new LinkedList<>();
        int max=0;
        for(char c:s.toCharArray()){
            // System.out.println("Char = "+c);
            if(!q.contains(c)){
                q.offer(c);
                max=Math.max(max,q.size());
                // System.out.print(q+" ");
            }
            else{
                while(q.contains(c)) q.poll();
                 q.offer(c);
            }
           
            // System.out.print(q+" ");
        }
        return max;

        
    }
}