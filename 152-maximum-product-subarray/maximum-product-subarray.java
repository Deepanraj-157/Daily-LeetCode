class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int currMax=nums[0];
        int currMin=nums[0];
        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            int preMax=currMax;
            int preMin=currMin;
            currMax=Math.max(num,Math.max(preMin*num,preMax*num));
            currMin=Math.min(num,Math.min(preMin*num,preMax*num));
            max=Math.max(max,currMax);
        }
        return max;
        
    }
}