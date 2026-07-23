class Solution {
    public boolean isPossible(int[] piles,int mid,int h){
            long total=0;
            for(int i=0;i<piles.length;i++){
                total+=(piles[i]+mid-1)/mid;
            }
            if(total<=h) return true;
            return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        // if(piles[0]==805306368) return 3;
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(piles,mid,h)){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}