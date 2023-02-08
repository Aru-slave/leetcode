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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        dfs(root,list);
        return list;
    }
    public void dfs(TreeNode root, List<Integer> list){
        if(root != null){//현재 노드가 null이 아니면 왼쪽에 노드가 있는지 확인
            //왼쪽부터 탐색 -> inorder travel
            dfs(root.left,list);//왼쪽에 노드가 있으면 다시 탐색
            list.add(root.val);//이 밑의 depth에 왼쪽에 노드가 없으면 다시 루트로 돌아와서
            //리스트에 추가
            dfs(root.right,list);//
        }
    }
}