class Solution {
    HashSet<List<Integer>> set=new HashSet<>();
    public void addElement(List<Integer> arr,int i,int[] nums){
        if(i==nums.length){
            set.add(new ArrayList<>(arr));
            return;
        } 
        addElement(arr,i+1,nums);
        arr.add(nums[i]);
        addElement(arr,i+1,nums);
        arr.remove(arr.size()-1);
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> tmp=new ArrayList<>();
        Arrays.sort(nums);
        addElement(tmp,0,nums);
        
        return new ArrayList<>(set);     
    }
}
