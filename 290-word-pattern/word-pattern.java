class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> h=new HashMap<>();
        String[] str=s.split(" ");
        if(pattern.length() != str.length) return false;
        int index=0;
        for(char c:pattern.toCharArray()){
            if(!h.containsKey(c) && index<str.length){
                if(!h.containsValue(str[index])) h.put(c,str[index++]);
                else  return false;
            }
            else{
                if(index<str.length)
                    if(!h.get(c).equals(str[index++])) return false;
            }
        }
        if(index<str.length) return false;
        return true;
        
    }
}