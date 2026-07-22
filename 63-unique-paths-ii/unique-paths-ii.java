class Solution {
    private int solve(int i,int j,int m,int n,int[][] dp,int[][] obstacleGrid){
        if(i == m-1 && j== n-1) return 1;
        if(j>=n || i>=m || obstacleGrid[i][j]==1){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        dp[i][j]=solve(i,j+1,m,n,dp,obstacleGrid)+solve(i+1,j,m,n,dp,obstacleGrid);
        return dp[i][j];
        
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        // dp[0][0]=1;
        if(obstacleGrid[m-1][n-1]==1) return 0;
        return solve(0,0,m,n,dp,obstacleGrid);
        
    }
}