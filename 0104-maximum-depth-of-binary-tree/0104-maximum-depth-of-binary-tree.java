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
    public int max = 0;
    public int maxDepth(TreeNode root) {
        dfs(0,root);
        return max;
    }
    public void dfs(int count,TreeNode root){
        if(root == null){
            max = Math.max(count,max);
            return;
        }
        dfs(count+1,root.left);
        dfs(count+1,root.right);
    }

}