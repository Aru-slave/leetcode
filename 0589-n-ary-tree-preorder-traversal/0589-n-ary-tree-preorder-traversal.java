/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> list = new LinkedList<>();
    public List<Integer> preorder(Node root) {
        
        if(root == null) return list;
        dfs(root,list);
        return list;
        
    }
    public void dfs(Node root,List<Integer> list){
        list.add(root.val);
        for(Node n : root.children){
            preorder(n);
        }
    }
}