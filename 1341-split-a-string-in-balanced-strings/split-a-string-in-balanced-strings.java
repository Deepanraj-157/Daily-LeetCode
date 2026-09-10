class Solution {
    public int balancedStringSplit(String s) {
        int countL=0;
        int countR=0;
        int res=0;
        for(char c:s.toCharArray()){
            if(c == 'R') countR++;
            else countL++;
            if(countL == countR) {
                res++;
                countL=0;
                countR=0;
            }
        }
        return res;
        
    }
}