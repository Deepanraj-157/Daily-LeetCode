class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        HashSet<Integer> set=new HashSet<>();
        int max=-1;
        for(int i:nums){
            set.add(i);
            max=Math.max(max,i);
        }
        int ans=-1;
        int i=1;
        while(i<=max){
            if(!set.contains(i*k)){
                if((i*k)%k==0){
                    ans=i*k;
                    break;
                }
            } 

            i+=1;
        }
        if(ans==-1) return i;
        return ans;
    }
}