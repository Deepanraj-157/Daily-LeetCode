class Solution {
    // public int solve(int i,int[] dp){
    //     if(dp[i]!=-1) 
    //         return dp[i];

    //     dp[i]=solve(i-1,dp)+solve(i-2,dp);
    //     return dp[i];
    // }
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int pre2=0;
        int pre1=1;
        int curr=0;
        for(int i=2;i<=n;i++){
            curr=pre1+pre2;
            pre2=pre1;
            pre1=curr;
            
        }
        return curr;
    }
}