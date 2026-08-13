class Solution {
    public int countSegments(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                System.out.println(s.charAt(i));
                while(i<s.length() && s.charAt(i)!=' '){
                    i++;
                }
                count++;
            }

        }
        return count;
    }
}