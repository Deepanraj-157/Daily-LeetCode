class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        int leftMax=Integer.MIN_VALUE;
        int rightMax=Integer.MIN_VALUE;
        while(left<right){
            int sum=(right-left)*(Math.min(height[left],height[right]));
            max=Math.max(max,sum);
            leftMax=Math.max(leftMax,height[left]);
            rightMax=Math.max(rightMax,height[right]);
            if(leftMax<rightMax){
                left++;
            }
            else
                right--;
        }
        return max;
        
    }
}