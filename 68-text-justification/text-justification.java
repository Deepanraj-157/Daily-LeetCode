class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res=new ArrayList<>();
        int i=0;
        int j=0;
        int len=0;
        while(j<words.length){
            if(len+words[j].length()+(j-i)<=maxWidth){
                len+=words[j].length();
                j++;
            }
            else{
                int gaps=j-i-1;
                int spaces=maxWidth-len;
                StringBuilder line=new StringBuilder();
                if(j==words.length || gaps==0){
                    for(int k=i;k<j;k++){
                        if(k+1==j){
                            line.append(words[k]);
                        }
                        else{
                            line.append(words[k]);
                            line.append(" ");
                        }
                    }
                    while(line.length()<maxWidth)
                    {
                        line.append(" ");
                    }
                }
                else{
                    int spaceForEach=spaces/gaps;
                    int extra = spaces%gaps;
                    for(int k=i;k<j;k++){
                        int count=spaceForEach;
                        line.append(words[k]);
                        if(extra>0) {
                            count++;
                            extra--;
                        }
                        if(k+1!=j){
                            for(int space=0;space<count;space++){
                                line.append(" ");
                            }
                        }
                    }
                }
                len=0;
                i=j;
                res.add(line.toString());
            }  
        }
        StringBuilder line=new StringBuilder();
        // System.out.print(words[i]);
        for(int k=i;k<j;k++){
            if(k+1==j){
                line.append(words[k]);
            }
            else{
                line.append(words[k]);
                line.append(" ");
            }
        }
        System.out.print(line.length());
        while(line.length()<maxWidth)
        {
            line.append(" ");
        }
        res.add(line.toString());
        return res;
        
    }
}