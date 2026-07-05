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
    int preIndex=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++) map.put(inorder[i],i);
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length,map);
    }
    public TreeNode build(int[] preorder,int prestart,int preend,int[] inorder,int instart,int inend,HashMap<Integer,Integer> map){
        if(prestart>preend || instart>inend) return null;
        TreeNode root=new TreeNode(preorder[prestart]);
        int index=map.get(preorder[prestart]);
        int numLeft=index-instart;
        root.left=build(preorder,prestart+1,prestart+numLeft,inorder,instart,index-1,map);
        root.right=build(preorder,prestart+numLeft+1,preend,inorder,index+1,inend,map);
        return root;
    }
}