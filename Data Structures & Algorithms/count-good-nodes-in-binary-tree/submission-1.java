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
    static int gn = 0;

    public static void dfs(TreeNode root, int max)
    {   
        if(root==null) return;
        if(root.val>=max){
            gn += 1;
            max = root.val;
        }
        dfs(root.left, max);
        dfs(root.right, max);
    }

    public int goodNodes(TreeNode root) {
        gn=0;
        if(root==null) return 0;
        dfs(root,root.val);
        return gn;
    }
}
