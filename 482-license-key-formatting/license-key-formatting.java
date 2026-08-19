class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String ans="";
        int count=0;
        for(char c:s.toCharArray()){
            if(c!='-') count++;
        }
        int rem=count%k;
        int words=count/k;
        if(rem==0){
            int i=0;
            for(int a=0;a<s.length();a++){
                char ch=s.charAt(a);
                if(i==k){
                    words--;
                    i=0;
                    if(words!=0)ans+='-';
                    if(ch!='-'){
                        ans+=Character.toUpperCase(ch);
                        i++;
                    }
                }
                else{
                    if(ch!='-'){
                        ans+=Character.toUpperCase(ch);
                        i++;
                    }
                }
            }
        }
    
        else{
            boolean check=true;
            int j=0;
            for(int l=0;l<s.length();l++){
                char ch=s.charAt(l);
                if(rem!=0){
                    if(ch!='-'){
                        ans+=Character.toUpperCase(ch);
                        rem--;
                    }
                }
                else{
                    if(check){
                        check=false;
                        ans+='-';
                    }
                    if(j==k){
                        words--;
                        j=0;
                        if(words!=0)ans+='-';
                        if(ch!='-'){
                            ans+=Character.toUpperCase(ch);
                            j++;
                        }
                    }
                    else{
                        if(ch!='-'){
                            ans+=Character.toUpperCase(ch);
                            j++;
                        }
                    }
                }
            }
        }
        return ans;
        
    }
}