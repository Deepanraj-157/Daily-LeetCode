class Solution {
    public int findMin(int i,int j,List<List<Integer>> triangle,int[][] dp){
        if(i==triangle.size()-1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j]!=-100000) return dp[i][j];
        int left=findMin(i+1,j,triangle,dp);
        int right=findMin(i+1,j+1,triangle,dp);
        dp[i][j]=triangle.get(i).get(j)+Math.min(right,left);
        if(dp[i][j]==-100000) return 0;
        return dp[i][j];

    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int n=triangle.get(m-1).size();
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-100000);
        }
        // dp[0][0]=triangle.get(0).get(0);
        return findMin(0,0,triangle,dp);
        
    }
}