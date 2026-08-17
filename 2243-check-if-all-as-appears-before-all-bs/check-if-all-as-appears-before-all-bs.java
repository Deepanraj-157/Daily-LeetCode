class Solution {
    public boolean checkString(String s) {
        char pre=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='a' && pre=='b') return false;
            pre=s.charAt(i);
        }
        return true;
        
        
    }
}