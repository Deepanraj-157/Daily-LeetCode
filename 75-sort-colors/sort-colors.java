class Solution {
    public void sortColors(int[] nums) {
        int x=0;
        int y=0;
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) x++;
            if(nums[i]==1) y++;
            if(nums[i]==2) z++;
        }
        int index=0;
        while(x>0) {
            nums[index++]=0;
            x--;
        }
        while(y>0){
            nums[index++]=1;
            y--;
        }
        while(z>0){
            nums[index++]=2;
            z--;
        }
        
        
    }
}