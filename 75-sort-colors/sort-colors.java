class Solution {
    public void sortColors(int[] nums) {
        int curr=0;
        int left=0;
        int right=nums.length-1;
        while(curr<=right){
            if(nums[curr]==0){
                int tmp=nums[left];
                nums[left]=nums[curr];
                nums[curr]=tmp;
                left++;
                curr++;
            }
            else if(nums[curr]==1) curr++;
            else{
                int tmp=nums[right];
                nums[right]=nums[curr];
                nums[curr]=tmp;
                right--;
            }
            
        }
    }
}