class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]==val){
                while(j<nums.length && nums[j]==val  ) 
                    j++;
                if(j<nums.length){
                     int tmp=nums[j];
                    nums[j]=nums[i];
                nums[i]=tmp;
                }
               
            }
            i++;
            j++;
        }
        int count=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=val)count++;
        }
    return count;   
    }
}