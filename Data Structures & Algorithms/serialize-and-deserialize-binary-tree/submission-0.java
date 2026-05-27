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

public class Codec {
    int index=0;

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root, sb);
        return sb.toString();
    }

    public void dfs(TreeNode root, StringBuilder sb){
        if(root==null){
            sb.append("n,");
            return ;
        }    
        sb.append(root.val).append(",");
        dfs(root.left, sb);
        dfs(root.right, sb);
    } 

    // Decodes your encoded data to tree.
    public TreeNode dfsdeserialize(String[] data)
    {
        if(data[index].equals("n")){
            index++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(data[index]));
        index++;
        root.left = dfsdeserialize(data);
        root.right = dfsdeserialize(data);
        return root;
    }

    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        return dfsdeserialize(arr);
    }   
}
