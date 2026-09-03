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
    ArrayList<Integer> arr1=new ArrayList<>();
    ArrayList<Integer> arr2=new ArrayList<>();

    public void getRoot1Leaf(TreeNode root){
        if(root==null) return;
        getRoot1Leaf(root.left);
        if(root.left==null && root.right==null){
            arr1.add(root.val);
        }
        getRoot1Leaf(root.right);
    }
    public void getRoot2Leaf(TreeNode root){
        if(root==null) return;
        getRoot2Leaf(root.left);
        if(root.left==null && root.right==null){
            arr2.add(root.val);
        }
        getRoot2Leaf(root.right);
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        getRoot1Leaf(root1);
        getRoot2Leaf(root2);
        if(arr1.size() != arr2.size()) return false;
        for(int i=0;i<arr1.size();i++){
            if(!arr1.get(i).equals(arr2.get(i))) 
                return false;
            
        }
        return true;
        
    }
}