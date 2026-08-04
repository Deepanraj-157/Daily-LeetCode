class Solution {
    public void dfs(int curr,int[][] isConnected,boolean[] visited){
        visited[curr]=true;
        for(int i=0;i<isConnected[curr].length;i++){
            if(!visited[i] && isConnected[curr][i]==1) dfs(i,isConnected,visited);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]) {
                dfs(i,isConnected,visited);
                count++;
            }
        }
        return count;
    }
}