class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int row=image.length;
        int col=image[0].length;
        int[][] dirs=new int[][]{
            {0,-1},
            {-1,0},
            {0,1},
            {1,0}
        };
        boolean visited[][] = new boolean[row][col];
        for(int i=0;i<row;i++){
            Arrays.fill(visited[i],false);
        }
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{sr,sc});
        int pre=image[sr][sc];

        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] tmp=q.poll();
                int currRow=tmp[0];
                int currCol=tmp[1];
                if(!visited[currRow][currCol]){
                    visited[currRow][currCol]=true;
                    image[currRow][currCol]=color;

                    for(int[] dir:dirs){
                        int newRow=currRow+dir[0];
                        int newCol=currCol+dir[1];
                        if(newRow>=0 && newRow<row && newCol>=0 && newCol<col){
                            if(image[newRow][newCol]==pre)q.offer(new int[]{newRow,newCol});
                        }

                    }
                    
                }
            }

        }
        return image;


        
    }
}