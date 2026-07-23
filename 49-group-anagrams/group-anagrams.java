class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> ans=new HashMap<>();
        for(String s:strs){
            char[] charArr=s.toCharArray();
            Arrays.sort(charArr);
            String s1=new String(charArr);
            if(!ans.containsKey(s1)){
                ans.putIfAbsent(s1,new ArrayList<>());
                ans.get(s1).add(s);
            }
            else{
                ans.get(s1).add(s);
            }

        }
        return new ArrayList<>(ans.values());
        
    }
}