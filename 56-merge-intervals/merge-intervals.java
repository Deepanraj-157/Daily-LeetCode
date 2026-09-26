class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<Integer>> list=new ArrayList<>();
        int start=-1;
        int end=-1;
        for(int [] interval:intervals){
            if(start == -1){
                start=interval[0];
                end=interval[1];
            }
            else{
                if(end<interval[0] ){
                    List<Integer> tmp=new ArrayList<>();
                    tmp.add(start);
                    tmp.add(end);
                    list.add(tmp);
                    start=interval[0];
                    end=interval[1];
                }
                else{
                    if(end<interval[1])
                        end=interval[1];
                }
            }

        }
        list.add(Arrays.asList(start, end));

    int[][] result = new int[list.size()][2];

    for (int i = 0; i < list.size(); i++) {
        result[i][0] = list.get(i).get(0);
        result[i][1] = list.get(i).get(1);
    }

    return result;

        
    }
}