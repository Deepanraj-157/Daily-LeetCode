class Solution {
    public int trap(int[] height) {
        int water=0;
        int left=0;
        int right=height.length-1;
        int rightMax=Integer.MIN_VALUE;
        int leftMax=Integer.MIN_VALUE;
        rightMax=Math.max(rightMax,height[right]);
        leftMax=Math.max(leftMax,height[left]);
        while(left<right){

            if(height[left]<=height[right]){
                if(height[left]>=leftMax)
                    leftMax=height[left];
                else
                    water+=leftMax-height[left];
                left++;
            }
            else{
                if(height[right]>=rightMax)
                    rightMax=height[right];
                else
                    water+=rightMax-height[right];
                right--;
            }
        }
        return water;
    }
}