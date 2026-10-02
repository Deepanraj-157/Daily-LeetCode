class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount=0;
        int tenCount=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) fiveCount++;
            else if(bills[i]==10){
                if(fiveCount<1) return false;
                else fiveCount--;
                tenCount++;
            }
            else{
                if(tenCount>=1){
                    tenCount--;
                    if(fiveCount<1) return false;
                    else fiveCount--;
                }
                else{
                    if(fiveCount<3) return false;
                    else fiveCount-=3;
                }
                
                
            }
        }
        return true;
    }
}