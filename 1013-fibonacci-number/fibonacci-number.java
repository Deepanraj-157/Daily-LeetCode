class Solution {
    public int solve(int i,int[] dp){
        if(dp[i]!=-1) 
            return dp[i];

        dp[i]=solve(i-1,dp)+solve(i-2,dp);
        return dp[i];
    }
    public int fib(int n) {
        if(n==0) return 0;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        return solve(n,dp);
    }
}