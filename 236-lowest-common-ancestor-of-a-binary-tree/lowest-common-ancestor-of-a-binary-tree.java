/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode lca=null;
    public int findlca(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return 0;
        int left=findlca(root.left,p,q);
        int right=findlca(root.right,p,q);
        int curr=0;
        if(root.val==p.val || root.val==q.val){
            curr=1;
        }
        curr=curr+left+right;
        if(curr==2 && lca==null) {
            lca=root;
            return curr;
        }

        return curr;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        int tmp=findlca(root,p,q);
        return lca;
    }
}