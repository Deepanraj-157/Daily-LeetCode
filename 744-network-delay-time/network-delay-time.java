class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<int[]>> adjList=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] time : times){
            int u=time[0];
            int v=time[1];
            int wt=time[2];
            adjList.get(u).add(new int[]{wt,v});
        }
        int[] dis=new int[n+1];
        for(int i=0;i<=n;i++){
            dis[i]=Integer.MAX_VALUE;
        }
        dis[k]=0;
        PriorityQueue<int[]> minHeap=new PriorityQueue<>(
            (a,b)->Integer.compare(a[0],b[0]));        
        minHeap.offer(new int[]{0,k});
        while(!minHeap.isEmpty()){
            int[] curr=minHeap.poll();
            int currDis=curr[0];
            int currNode=curr[1];
            if(currDis>dis[currNode]) continue;
            for(int[] neigh : adjList.get(currNode)){
                int wt=neigh[0];
                int neighNode=neigh[1];
                int newDis=wt+currDis;
                if(newDis<dis[neighNode]){
                    dis[neighNode]=newDis;
                    minHeap.offer(new int[]{newDis,neighNode});
                }
            }
        }
        int max=Integer.MIN_VALUE;

        for(int i=1;i<=n;i++){
            max=Math.max(dis[i],max);
        }
        if(max==Integer.MAX_VALUE) return -1;
        return max;
        
    }
}