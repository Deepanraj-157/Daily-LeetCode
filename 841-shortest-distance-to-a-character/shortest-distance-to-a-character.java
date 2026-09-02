class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] arr1=new int[s.length()];
        int[] arr2=new int[s.length()];
        int tmp=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                tmp=0;
            }
            arr1[i]=tmp;
            if(tmp>=0) tmp++;
        }
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==c){
                tmp=0;
            }
            arr2[i]=tmp;
            if(tmp>=0) tmp++;
        }
        int[] ans=new int[s.length()];
        for(int i=0;i<s.length();i++){
            // System.out.print(" arr1 :"+arr1[i]+" arr2 : "+arr2[i]);
            if(arr1[i]!=-1 && arr2[i]!=-1) ans[i]=Math.min(arr1[i],arr2[i]);
            else if(arr1[i]==-1) ans[i]=arr2[i];
            else ans[i]=arr1[i];

        }
        return ans;
        
    }
}