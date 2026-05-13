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
    static HashMap<Integer, Integer> map = new HashMap<>();
    public static void dfs(TreeNode root, int level)
    {
        if(root == null) return;

        if(!map.containsKey(level))
        {
            map.put(level, root.val);
        }

        dfs(root.right , level+1);
        dfs(root.left , level+1);
    }

    public static List<Integer> rightSideView(TreeNode root) {
        map.clear();
        dfs(root, 0);

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<map.size(); i++)
        {
            list.add(map.get(i));
        }

        return list;
    }
}
