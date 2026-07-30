class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) neg.add(nums[i]);
            else pos.add(nums[i]);
        }
        int index=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=pos.get(index);
            i++;
            nums[i]=neg.get(index);
            index++;
        }
        return nums;

        
    }
}