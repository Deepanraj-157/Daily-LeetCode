class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            int j=i+1;
            for(j=i+1;j<nums2.length;j++){
                if(nums2[j]>nums2[i]){
                    map.put(nums2[i],nums2[j]);
                    break;
                }
            }
            if(j==nums2.length) map.put(nums2[i],-1);
        }
        System.out.print(map);
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }

        return res;
        
    }
}