class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix=new int[m][n];
        for(int i=0;i<m;i++) Arrays.fill(matrix[i],0);
        for(int[] tmp:indices){
            int row=tmp[0];
            int col=tmp[1];
            if(row>=0 && row<m){
            for(int i=0;i<n;i++){
                matrix[row][i]++;
            }
            }
            if(col>=0 && col<n){
            for(int i=0;i<m;i++){
                matrix[i][col]++;
            }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]%2==1) count++;
            }
        }
        return count;
        
    }
}