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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<inorder.length; i++)
        {
            map.put(inorder[i], i);
        }

        TreeNode root = build(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);

        return root;
    }

    public TreeNode build(int[] p,int ps,int pe, int[] i, int is,int ie, Map<Integer, Integer> map)
    {
        if(ps>pe || is>ie) return null;

        TreeNode root = new TreeNode(p[ps]);

        int inRoot = map.get(root.val);
        int numleft = inRoot - is;

        root.left = build(p, ps+1, ps+numleft, i, is, inRoot-1, map);
        root.right = build(p, ps+numleft+1, pe, i, inRoot+1, ie, map);

        return root;
    }
}
