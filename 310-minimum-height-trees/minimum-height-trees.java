class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> ans=new ArrayList<>();
        if(n==1){
            ans.add(0);
            return ans;
        }
        int[] degree=new int[n];
        Arrays.fill(degree,0);
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            degree[edge[0]]++;
            degree[edge[1]]++;
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        System.out.print(adj);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(degree[i]==1) q.offer(i);
        }
        while(n>2){
            int size=q.size();
            n-=size;
            for(int i=0;i<size;i++){
                for(int neigh:adj.get(q.poll())){
                    degree[neigh]--;
                    if(degree[neigh]==1) q.offer(neigh);
                }
            }
        }
        while(!q.isEmpty()){
            ans.add(q.poll());
        }
        return ans;
    }
}