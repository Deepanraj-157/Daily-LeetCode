class Solution {
    public boolean isPowerOfThree(int n) {
        double tmp=1;
        int i=0;
        while(tmp<=n){
            tmp=Math.pow(3,i);
            if(tmp==n) return true;
            i++;
        }
        return false;
        
    }
}