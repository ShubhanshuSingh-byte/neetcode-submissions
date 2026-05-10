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
    String preOrder(TreeNode root)
    {
        if(root==null) return "null";

        StringBuilder sb = new StringBuilder("@");
        sb.append(root.val);
        sb.append(preOrder(root.left));
        sb.append(preOrder(root.right));

        return sb.toString();
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String org = preOrder(root);
        String dyplicate = preOrder(subRoot);
        System.out.println(org);
        System.out.println(dyplicate);

        return (org.contains(dyplicate));
    }
}
