class Solution {
    private int helper(int ind,int pre,int[] nums,int[][] dp){
        if( ind == nums.length) return 0;
        if(dp[ind][pre+1] != -1) return dp[ind][pre+1];
        int notTake = helper(ind+1,pre,nums,dp);
        int take = 0;
        if(pre == -1 || nums[ind]>nums[pre]){
            take=1+helper(ind+1,ind,nums,dp);
        }
        return dp[ind][pre+1]=Math.max(take,notTake);
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,-1,nums,dp);
    }
}