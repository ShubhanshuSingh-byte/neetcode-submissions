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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;

        boolean bool = Math.abs(h(root.left)-h(root.right))<=1 ? true:false;
        return bool && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int h(TreeNode root)
    {
        if(root==null) return 0;

        return Math.max(h(root.left), h(root.right))+1;
    }
}
