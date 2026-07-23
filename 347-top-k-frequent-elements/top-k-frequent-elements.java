class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<List<Integer>> pq= new PriorityQueue<>(
            (a,b)->a.get(1)-b.get(1));
        for(int key:map.keySet()){
            List<Integer> tmp=new ArrayList<>();
            tmp.add(key);
            tmp.add(map.get(key));
            pq.add(tmp);
            if(pq.size()>k) pq.poll();

        }
        int[] ans=new int[k];
        int index=0;
        for(List<Integer> list:pq){
            ans[index++]=list.get(0);
        }
        return ans;
        
    }
}