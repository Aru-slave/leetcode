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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();
        dfs(list,root,"");
        return list;
        
    }
    public void dfs(List<String> list, TreeNode root, String path){
        if(root == null) return;
        if(path == "")
            path = String.valueOf(root.val);
        else path = path + "->" + root.val;
         if(root.left == null && root.right == null) list.add(path);
        dfs(list,root.left,path);
        dfs(list,root.right,path);
        
    }
}