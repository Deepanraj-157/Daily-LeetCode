class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>> res = new HashSet<>();
        HashSet<Integer> set=new HashSet<>();
        
        for(int i:candidates){
            map.put(i,map.getOrDefault(i,0)+1);
            set.add(i);
        }
        int[] arr = set.stream()
               .mapToInt(Integer::intValue)
               .toArray();        makeCombination(arr, target, 0, new ArrayList<>(), 0, res);

        return new ArrayList<>(res);
        
    }
private void makeCombination(
            int[] candidates,
            int target,
            int idx,
            List<Integer> comb,
            int total,
            HashSet<List<Integer>> res) {

        if (total == target) {
            HashMap<Integer,Integer> map2=new HashMap<>();
            for(int j:comb){
                map2.put(j,map2.getOrDefault(j,0)+1);
            }

            List<Integer> newList=new ArrayList<>(comb);
            Collections.sort(newList);
            for(int j:map2.keySet()){
                if(map2.get(j)>map.get(j)) return;
            }
            res.add(newList);
            return;
        }

        if (total > target || idx >= candidates.length) {
            return;
        }

        // Take current element
        comb.add(candidates[idx]);

        // idx stays same because we can reuse the element
        makeCombination(
            candidates,
            target,
            idx,
            comb,
            total + candidates[idx],
            res
        );

        // Backtrack
        comb.remove(comb.size() - 1);

        // Skip current element
        makeCombination(
            candidates,
            target,
            idx + 1,
            comb,
            total,
            res
        );
    }
}