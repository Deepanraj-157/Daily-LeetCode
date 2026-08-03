class Solution {
    public int[] reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            left++;
            right--;
        }
        return arr;
    }
    public void rotate(int[][] matrix) {
        int[][] tmp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                tmp[j][i]=matrix[i][j];
            }
        }
        for(int i=0;i<tmp.length;i++){
            matrix[i]=reverse(tmp[i]);
        }

        
    }
}