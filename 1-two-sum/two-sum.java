class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum=target-nums[i];
            if(h.containsKey(sum)){
                return new int[]{i,h.get(sum)};
            }
            h.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
}