class Solution {
    public boolean isPowerOfTwo(int n) {
        double tmp=1;
        int i=0;
        while(tmp<=n){
            tmp=Math.pow(2,i);
            if(tmp==n) return true;
            i++;
        }
        return false;
        
    }
}