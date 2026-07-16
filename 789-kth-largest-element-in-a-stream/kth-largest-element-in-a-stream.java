class KthLargest {
    int K;
    PriorityQueue<Integer> maxHeap;
    public KthLargest(int k, int[] nums) {
        maxHeap=new PriorityQueue<>(
            (a,b)->Integer.compare(a,b));
        for(int i=0;i<nums.length;i++){
            maxHeap.offer(nums[i]);
            if(maxHeap.size()>k) maxHeap.poll();
        } 
        K=k;
    }
    
    public int add(int val) {

        maxHeap.offer(val);
        if(maxHeap.size()>K)maxHeap.poll();
        return maxHeap.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */