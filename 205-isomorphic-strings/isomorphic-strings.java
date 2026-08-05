class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))) 
            if(!map.containsValue(s.charAt(i)))
                map.put(t.charAt(i),s.charAt(i));
            else return false;
            else{
                if(map.get(t.charAt(i)) != s.charAt(i)  ) return false;
            }
        }
        return true;
        
    }
}