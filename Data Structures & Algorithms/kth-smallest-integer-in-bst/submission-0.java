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
    static int counter = 0;
    static int val;
    public static int kthSmallest(TreeNode root, int k) {
        counter = 0;
        inOrder(root, k);
        return val;
    }

    public static void inOrder(TreeNode root,int k)
    {
        if(root==null) return;
        inOrder(root.left, k);
        counter++;
        if(counter==k) {
            val=root.val;
            return;    
        }
        inOrder(root.right, k);
    }
}
