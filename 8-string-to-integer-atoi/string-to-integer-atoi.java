class Solution {
    public int myAtoi(String s) {
        
        boolean neg=false;
        boolean pos=false;
        String tmp="";
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)) break;
            if(neg || pos){
                if(!Character.isDigit(c)) return 0;
            }
            if(c == '-'){
                neg=true;
            }
            if(c == '+') pos=true;
        }
        if(neg && pos) return 0;
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i)!='-' && s.charAt(i) != '+' && s.charAt(i)!=' ') break;
            if(Character.isDigit(s.charAt(i)) ){
                for(int j=i;j<s.length();j++){
                    if(Character.isDigit(s.charAt(j))){
                        tmp+=s.charAt(j);
                    }
                    else break;
                }
                // return Integer.parseInt(tmp);
                long num = 0;

                for (int k = 0; k < tmp.length(); k++) {
                    num = num * 10 + (tmp.charAt(k) - '0');

                    if (!neg && num > Integer.MAX_VALUE)
                        return Integer.MAX_VALUE;

                    if (neg && -num < Integer.MIN_VALUE)
                        return Integer.MIN_VALUE;
                }

                return neg ? (int)-num : (int)num;
                

            }
        
        }

        return 0;
        
    }
}