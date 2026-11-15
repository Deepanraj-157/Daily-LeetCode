class Solution {
    private boolean helper( int m , int k,int day,int[] bloomDay){
        int flower=0;
        int b=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                flower++;
                if(flower == k){
                    b++;
                    flower=0;
                }
            }
            else flower=0;
        }
        if(b>=m) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(m,k,mid,bloomDay)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
        
    }
}