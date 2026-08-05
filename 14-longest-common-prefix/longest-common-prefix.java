class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        for(String s:strs){
            if(s.length()<min) min=s.length();
        }
        String res="";
        for(int i=0;i<min;i++){
            char c=strs[0].charAt(i);
            int j=0;
            System.out.print(c+" ");
            for(j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=c) return res;
            }
            if(j==strs.length) res+=c;
   

        }
        return res;
    }
}