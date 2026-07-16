class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(
            (a,b)->Integer.compare(b,a));
        for(int i=0;i<nums.length;i++){
            maxHeap.offer(nums[i]);
        }   
        int ans=0;  
        while(k!=0){
            ans=maxHeap.poll();
            k--;
        }   
        return ans;
    }
}