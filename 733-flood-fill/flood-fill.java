class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;
        Queue<int[]> q=new LinkedList<>();
        int rows=image.length;
        int cols=image[0].length;
        int c=image[sr][sc];
        q.offer(new int[]{sr,sc});
        image[sr][sc]=color;
        while(!q.isEmpty()){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                int[] tmp=q.poll();
                //up
                if(tmp[0]-1>-1){
                    if(image[tmp[0]-1][tmp[1]] == c){
                        image[tmp[0]-1][tmp[1]]=color;
                            q.offer(new int[]{tmp[0]-1,tmp[1]});
                    }
                                

                }
                //down
                if(tmp[0]+1<rows){
                    if(image[tmp[0]+1][tmp[1]] == c){
                        image[tmp[0]+1][tmp[1]]=color;
                        q.offer(new int[]{tmp[0]+1,tmp[1]});
                    }

                }
                //right
                if(tmp[1]+1<cols){
                    if(image[tmp[0]][tmp[1]+1] == c){
                        image[tmp[0]][tmp[1]+1]=color;
                        q.offer(new int[]{tmp[0],tmp[1]+1});
                    }

                }
                //left
                if(tmp[1]-1>-1){
                    if(image[tmp[0]][tmp[1]-1] == c){
                        image[tmp[0]][tmp[1]-1]=color;
                        q.offer(new int[]{tmp[0],tmp[1]-1});
                    }

                }
            }
        }
        return image;
        
    }
}