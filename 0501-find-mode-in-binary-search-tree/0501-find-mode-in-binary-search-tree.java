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
    public int[] findMode(TreeNode root) {
        if(root == null) return new int[0];
        List<Integer> list = new LinkedList<>();
        Map<Integer,Integer> map = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> ans = new LinkedList<>();
        queue.add(root);
        int max = 0;
        while(!queue.isEmpty()){
            int n = queue.size();
   
            for(int i = 0; i < n; i++){
            TreeNode cur = queue.poll();
            if(map.get(cur.val) == null){
                map.put(cur.val,1);
                list.add(cur.val);
            }
            else map.replace(cur.val,map.get(cur.val) + 1);
                if(cur.left != null){
                    queue.add(cur.left);
                }
                if(cur.right != null){
                    queue.add(cur.right);
                }
            }


        }

        for(int i = 0; i < list.size(); i++){
            if(map.get(list.get(i)) > max){
             max = map.get(list.get(i));
            }
        }
        for(int i = 0; i < list.size(); i++){
            if(map.get(list.get(i)) == max)
                ans.add(list.get(i));
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}