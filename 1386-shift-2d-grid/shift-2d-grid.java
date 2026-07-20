class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        while(k>0){
            int pre=0;
            int last=grid[grid.length-1][grid[0].length-1];
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[i].length;j++){
                    if(i==0 && j==0){
                        pre=grid[i][j];
                        continue;
                    }
                    int tmp=pre;
                    pre=grid[i][j];
                    grid[i][j]=tmp;

                }
            }
            grid[0][0]=last;
            k--;
        }
        List<List<Integer>> list = new ArrayList<>();

        for (int[] row : grid) {
            List<Integer> temp = new ArrayList<>();
            for (int num : row) {
                temp.add(num);
            }
            list.add(temp);
        }
        return list;
        
    }
}