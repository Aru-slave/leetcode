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
        if(root == null) return true;
        int depth = 0;
        if(Math.abs(dfs(depth,root.left)-dfs(depth,root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

        public static int dfs(int depth,TreeNode root){
        if(root == null){
           return depth;
        }
    return Math.max(dfs(depth+1,root.left),dfs(depth+1,root.right));
    }

}