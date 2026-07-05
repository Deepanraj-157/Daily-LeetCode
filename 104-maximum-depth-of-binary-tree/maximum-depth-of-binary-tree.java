/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        int len=0;
        List<List<Integer>> res=new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode tmp=q.poll();
                list.add(tmp.val);
                if(tmp.left!=null) q.offer(tmp.left);
                if(tmp.right!=null) q.offer(tmp.right);
            }
            res.add(list);
            len++;
        }
        return len;

        
    }
}