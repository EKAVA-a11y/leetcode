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
    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void level(TreeNode root, int level, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            list.add(root.val);
            return;
        }
        level(root.left, level - 1, list);
        level(root.right, level - 1, list);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            List<Integer> list = new ArrayList<>();
            level(root, i, list);
            ans.add(list);
        }
        return ans;
    }
}