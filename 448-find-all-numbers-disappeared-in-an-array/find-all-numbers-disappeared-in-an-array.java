class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] ans=new boolean[nums.length+1];
        Arrays.fill(ans,false);

        for(int i=0;i<nums.length;i++){
            ans[nums[i]]=true;
        }
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!ans[i]) res.add(i);
        }
        return res;
    }
}