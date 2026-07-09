class Solution {
    public int numIslands(char[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int rows=grid.length;
        int cols=grid[0].length;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    q.offer(new int[]{i,j});
                    grid[i][j]='0';
                    while(!q.isEmpty()){
                        int size=q.size();
                        for(int k=0;k<size;k++){
                            int[] tmp=q.poll();
                            //up
                            if(tmp[0]-1>-1){
                                if(grid[tmp[0]-1][tmp[1]] == '1'){
                                    grid[tmp[0]-1][tmp[1]]='0';
                                    q.offer(new int[]{tmp[0]-1,tmp[1]});
                                }
                            }
                            //down
                            if(tmp[0]+1<rows){
                                if(grid[tmp[0]+1][tmp[1]] == '1'){
                                    grid[tmp[0]+1][tmp[1]]='0';
                                    q.offer(new int[]{tmp[0]+1,tmp[1]});
                                }

                            }
                            //right
                            if(tmp[1]+1<cols){
                                if(grid[tmp[0]][tmp[1]+1] == '1'){
                                    grid[tmp[0]][tmp[1]+1]='0';
                                    q.offer(new int[]{tmp[0],tmp[1]+1});
                                }

                            }
                            //left
                            if(tmp[1]-1>-1){
                                if(grid[tmp[0]][tmp[1]-1] == '1'){
                                    grid[tmp[0]][tmp[1]-1]='0';
                                    q.offer(new int[]{tmp[0],tmp[1]-1});
                                }

                            }

                        }
                    }
                }
                
            }
        }
        return count;
    }
}
