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
    TreeNode pre;
    int curCount = 1;
    int maxCount = 0;
    public int[] findMode(TreeNode root) {
      List<Integer> list = new LinkedList<>();
        dfs(root,list);
        return list.stream().mapToInt(Integer::intValue).toArray();
}
    public void dfs(TreeNode root, List<Integer> list){
        if(root == null) return;
       dfs(root.left,list);
        if(pre != null){
        if(pre.val == root.val)
                curCount++;
            else curCount = 1;
        }

        
        if(curCount > maxCount){
            maxCount = curCount;
            list.clear();
            list.add(root.val);
        }
        else if (curCount == maxCount && !list.contains(root.val))
             list.add(root.val);
        pre = root;
        
        dfs(root.right,list);
    }
}