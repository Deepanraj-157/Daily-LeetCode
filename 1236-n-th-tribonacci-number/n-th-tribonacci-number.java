class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        int pre3=0;
        int pre2=1;
        int pre1=1;
        for(int i=3;i<=n;i++){
            int sum=pre1+pre2+pre3;
            pre3=pre2;
            pre2=pre1;
            pre1=sum;
        }
        return pre1;
        
    }
}