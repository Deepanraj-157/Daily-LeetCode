class Solution {
    public int removeDuplicates(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return list.size();
        
    }
}