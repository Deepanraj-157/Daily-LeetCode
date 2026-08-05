class Solution {
    public String largestOddNumber(String num) {
        int right=num.length()-1;
        for(right=right;right>=0;right--){
            int tmp = Character.getNumericValue(num.charAt(right));            
            if(tmp%2==1) break;
        }
        String res="";
        for(int left=0;left<=right;left++){
            res+=num.charAt(left);
        }
        return res;

        
    }
}