class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<=nums.length-k;i++){
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<i+k;j++){
                if(!set.contains(nums[j])){
                    map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                    set.add(nums[j]);
                }
            }
        }
        int ans=-1;
        int max=Integer.MIN_VALUE;
        for(int key:map.keySet() ){
            if(map.get(key)==1 && key>max){
                ans=key;
                max=key;
            }
        }
        return ans;
        
    }
}