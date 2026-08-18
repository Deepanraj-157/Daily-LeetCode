class Solution {
    List<List<Integer>> list=new ArrayList<>();
    public void addElement(List<Integer> arr,int i,int[] nums){
        if(i==nums.length){
            list.add(new ArrayList<>(arr));
            return;
        } 
        addElement(arr,i+1,nums);
        arr.add(nums[i]);
        addElement(arr,i+1,nums);
        arr.remove(arr.size()-1);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> tmp=new ArrayList<>();
        addElement(tmp,0,nums);
        return new ArrayList<>(list);
        
    }
}