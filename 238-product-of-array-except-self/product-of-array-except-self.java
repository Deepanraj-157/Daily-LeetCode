class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre[]=new int[nums.length];
        int suff[]=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]*nums[i];
        }
        suff[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            suff[i]=suff[i+1]*nums[i];
        }
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int p=1;
            int s=1;
            if(i>0) p=pre[i-1];
            if(i+1<nums.length) s=suff[i+1];
            res[i]=p*s;
        }
        return res;
    }
}