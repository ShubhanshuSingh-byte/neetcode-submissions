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
    public static String pO(TreeNode root)
    {
        if(root==null) return "n";

        StringBuilder sb = new StringBuilder();

        sb.append(root.val);
        sb.append(pO(root.left));
        sb.append(pO(root.right));

        return sb.toString();
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String r = pO(root);
        String s = pO(subRoot);
        System.out.println(s + " " + r);
        return r.contains(s);
    }
}
