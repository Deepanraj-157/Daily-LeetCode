class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        // for(int i=0;i<m;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        if(obstacleGrid[m-1][n-1]==1 || obstacleGrid[0][0]==1) return 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) {
                    dp[i][j]=1;
                    continue;
                }
                if( obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }
                //adding the pre way value
                //if the curr have two way form the source to curr
                if(i-1>=0 && j-1>=0){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    
                }
                //if the curr have only one way
                else if(i-1>=0){
                    dp[i][j]=dp[i-1][j];
                }
                else {
                    dp[i][j]=dp[i][j-1];
                }

            }
        }
        return dp[m-1][n-1];
        
    }
}