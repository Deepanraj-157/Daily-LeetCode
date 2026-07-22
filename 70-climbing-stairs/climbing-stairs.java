class Solution {
    private int solve(int n,int[] dp){
        if(n==1 || n==2) return n;
        if(dp[n]!=-1) return dp[n];
        dp[n]=solve(n-1,dp)+solve(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        // int[] dp=new int[n+1];
        // Arrays.fill(dp,-1);
        // dp[0]=1;
        // dp[1]=1;
        int pre1=1;
        int pre2=1;
        for(int i=2;i<=n;i++){
            // dp[i]=dp[i-1]+dp[i-2];
            int curr=pre1+pre2;
            pre2=pre1;
            pre1=curr;

        }
        return pre1;
        // return dp[n];
        // return solve(n,dp);
        
    }
}