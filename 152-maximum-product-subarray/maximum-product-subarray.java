class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int currPro=nums[0];
        int maxPro=nums[0];
        int minPro=nums[0];
        for(int i=1;i<nums.length;i++){
            int tmpMax=maxPro;
            maxPro=Math.max(nums[i],Math.max(maxPro*nums[i],minPro*nums[i]));
            minPro=Math.min(nums[i],Math.min(tmpMax*nums[i],minPro*nums[i]));
            max=Math.max(max,maxPro);
        }
        return max;
        
    }
}