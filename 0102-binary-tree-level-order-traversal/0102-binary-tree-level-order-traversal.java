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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list1 = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return list1;
        queue.add(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> list2 = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                TreeNode cur = queue.poll();
                list2.add(cur.val);
                if(cur.left != null)queue.add(cur.left);
                if(cur.right != null)queue.add(cur.right);
            }
        list1.add(list2);
        }
       
        return list1;
    }
}
