class Solution {
    HashSet<List<Integer>> list=new HashSet<>();
    public void addElement(List<Integer> arr,int i,int[] nums){
        if(i==nums.length){
            // Collections.sort(arr);
            List<Integer> newList=new ArrayList<>(arr);
            Collections.sort(newList);
            list.add(new ArrayList<>(newList));
            return;
        } 
        addElement(arr,i+1,nums);
        arr.add(nums[i]);
        addElement(arr,i+1,nums);
        arr.remove(arr.size()-1);
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> tmp=new ArrayList<>();
        addElement(tmp,0,nums);
        
        return new ArrayList<>(list);     
    }
}
