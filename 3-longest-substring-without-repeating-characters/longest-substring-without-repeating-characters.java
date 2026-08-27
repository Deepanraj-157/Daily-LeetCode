class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> q=new HashSet<>();
        int max=0;
        int left=0;
        for(char c:s.toCharArray()){
            if(!q.contains(c)){
                q.add(c);
                max=Math.max(max,q.size());
            }
            else{
                while(q.contains(c)){
                    q.remove(s.charAt(left));
                    left++;
                } 
                 q.add(c);
            }
           
        }
        return max;

        
    }
}