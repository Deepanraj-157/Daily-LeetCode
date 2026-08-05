class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if((Character.isLetter(s.charAt(left))||Character.isDigit(s.charAt(left))) && (Character.isLetter(s.charAt(right))||Character.isDigit(s.charAt(right)))){
                if(Character.toUpperCase(s.charAt(left)) != Character.toUpperCase(s.charAt(right))) return false;
                left++;
                right--;

            }
            if(!Character.isLetter(s.charAt(left)) && !Character.isDigit(s.charAt(left))) left++;
            if(!Character.isLetter(s.charAt(right)) && !Character.isDigit(s.charAt(right))) right--;
        }
        return true;
        
    }
}