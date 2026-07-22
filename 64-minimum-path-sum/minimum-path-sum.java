class Solution {
    private int findMin(int i,int j,int m,int n,int[][] grid,int[][] dp){
        if(i==m-1 && j==n-1) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        if(i==m-1){
            return grid[i][j]+findMin(i,j+1,m,n,grid,dp);
        }
        if(j==n-1)
            return grid[i][j]+findMin(i+1,j,m,n,grid,dp);
        
        dp[i][j]=grid[i][j]+Math.min(findMin(i+1,j,m,n,grid,dp),findMin(i,j+1,m,n,grid,dp));
        return dp[i][j];
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];

        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        // dp[0][0]=grid[0][0];
        return findMin(0,0,m,n,grid,dp);
        
    }
}