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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)  return false;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();

            if(currentNode.val == targetSum && currentNode.left==null && currentNode.right==null) {
                return true;
            }
            if(currentNode.left!=null) {
                currentNode.left.val =  currentNode.left.val + currentNode.val;
                stack.push(currentNode.left);
            }

            if(currentNode.right!=null) {
                currentNode.right.val = currentNode.right.val + currentNode.val;
                stack.push(currentNode.right);
            }
        }
        return false;
    }
}