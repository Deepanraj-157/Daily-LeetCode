class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int starCount=0;
        for(char c:s.toCharArray()){
            if(c=='*'){
                if(count%2==0){
                    starCount++;
                }
            }
            if(c=='|') count++;
        }
        return starCount;
        
    }
}