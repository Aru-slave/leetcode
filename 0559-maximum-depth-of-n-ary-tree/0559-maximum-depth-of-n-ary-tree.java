class Solution {
    public int maxDepth(Node root) {
        if(root==null) return 0;
        int max_depth = 0;
        for(Node child: root.children) {
            max_depth = Math.max(max_depth, maxDepth(child));
        }
        return 1 + max_depth;
    }
}