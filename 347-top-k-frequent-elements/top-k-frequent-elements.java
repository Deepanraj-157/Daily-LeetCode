class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> minHeap=new PriorityQueue<>(
            (a,b)->Integer.compare(a[1],b[1]));
        // for(int i=0;i<nums.length;i++){
            
        // }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            minHeap.add(new int[]{key,map.get(key)});
            if(minHeap.size()>k) minHeap.poll();

        }
        int[] ans=new int[k];
        int index=0;
        while(!minHeap.isEmpty()){
            int[] tmp=minHeap.poll();
            ans[index++]=tmp[0];
        }
        return ans;
        
    }
}