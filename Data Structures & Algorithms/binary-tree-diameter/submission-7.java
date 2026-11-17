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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int a = height(root.left);
        int b = height(root.right);

        int l = diameterOfBinaryTree(root.left);
        int r = diameterOfBinaryTree(root.right);

        return Math.max(a+b, Math.max(l, r));
    }

    public int height(TreeNode root){
        if(root==null){
            return 0;
        }

        return Math.max(height(root.left), height(root.right))+1;
    }
}
