class Solution {
    public int compress(char[] chars) {
        int left=0;
        int right=0;
        char tmp=chars[right];
        int count=0;
        int index=0;
        while(right<chars.length){
            if(chars[left]==chars[right]){
                right++;
            }
            else{
                if(right-left>1){
                    chars[index]=chars[left];
                    index++;
                    count = right-left;
                    String s = String.valueOf(count);

                    for (int i = 0; i < s.length(); i++) {
                        char ch = s.charAt(i);
                        chars[index++]=ch;
                    }

                }
                else{
                    chars[index]=chars[left];
                    index++;
                }
                left=right;
            }

        }
        if(right-left>1){
            chars[index]=chars[left];
            index++;
            count = right-left;
            String s = String.valueOf(count);

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                chars[index++]=ch;
            }
       }
        else{
            chars[index]=chars[left];
            index++;
        }
        left=right;
        return index;
        
    }
}