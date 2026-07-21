class Solution {
    // public int solve(int i,int[] nums,int[] dp){
    //     if(i<0) return 0;

    //     if(i==0) return nums[0];
    //     if(dp[i]!=-1) return dp[i]; 
    //     int robCurrent=nums[i]+solve(i-2,nums,dp);
    //     int leaveCurrent=solve(i-1,nums,dp);
    //     dp[i]=Math.max(robCurrent,leaveCurrent);
    //     return dp[i];
    // }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int pre2=nums[0];
        int pre1=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            int robCurr=nums[i]+pre2;
            int leaveCurr=pre1;
            pre2=pre1;
            
            dp[i]=Math.max(robCurr,leaveCurr);
            pre1=dp[i];
        }
        return pre1;

        
    }
}