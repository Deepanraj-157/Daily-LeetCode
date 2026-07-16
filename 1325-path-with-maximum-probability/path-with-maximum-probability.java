class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        ArrayList<ArrayList<double[]>> adjList=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            double wt=succProb[i];
            adjList.get(u).add(new double[]{wt,v});
            adjList.get(v).add(new double[]{wt,u});
        }
        double[] dis=new double[n];
        // for(int i=0;i<n;i++){
        //     dis[i]=0;
        // }
        dis[start_node]=1;
        PriorityQueue<double[]> minHeap=new PriorityQueue<>(
            (a,b)->Double.compare(b[0],a[0]));
        dis[start_node]=0;
        minHeap.offer(new double[]{1,start_node});
        while(!minHeap.isEmpty()){
            double[] curr=minHeap.poll();
            double currDis=curr[0];
            int currNode=(int)curr[1];
            if(currDis<dis[currNode]) continue;
            for(double[] neigh:adjList.get(currNode)){
                double wt=neigh[0];
                int neighNode=(int)neigh[1];
                double newDis=wt*currDis;
                if(newDis>dis[neighNode]){
                    dis[neighNode]=newDis;
                    minHeap.offer(new double[]{newDis,neighNode});
                }
            }
        }
    return dis[end_node];

    }
}