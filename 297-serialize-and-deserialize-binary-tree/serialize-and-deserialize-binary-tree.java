/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        ArrayList<String> res=new ArrayList<>();
        if(root == null) return "";
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode tmp=q.poll();
                if(tmp==null){
                    res.add("#");
                }
                else{
                    res.add(Integer.toString(tmp.val));
                    q.offer(tmp.left);
                    q.offer(tmp.right);
                }
            }
            
        }
        String ans="";
        for(String s:res){
            ans+=s;
            ans+=',';
        }
        return ans;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;
        String[] arr=data.split(",");
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(arr[0]));
        q.offer(root);
        int i=1;
        while(!q.isEmpty()){
            TreeNode parent=q.poll();
            if(!arr[i].equals("#")){
                TreeNode leftChild=new TreeNode(Integer.parseInt(arr[i]));
                parent.left=leftChild;
                q.offer(parent.left);
            }
            i++;
            if(!arr[i].equals("#")){
                TreeNode rightChild=new TreeNode(Integer.parseInt(arr[i]));
                parent.right=rightChild;
                q.offer(parent.right);
            }
            i++;
        }
        return root;


        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));