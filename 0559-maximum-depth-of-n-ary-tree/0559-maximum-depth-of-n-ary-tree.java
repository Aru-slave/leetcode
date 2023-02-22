class Solution {
 public int maxDepth(Node root) {
 if(root == null) return 0;
 Stack<Node> stack = new Stack<>();
 Stack<Integer> num = new Stack<>();
 stack.push(root);
 num.push(1);
 int depth = 1;

 while (!stack.empty()) {
  Node node = stack.pop();
  int count = num.pop();

  if (node.children != null) {
   for (Node nod : node.children) {
     stack.push(nod);
     depth = Math.max(count + 1, depth);
     num.push(count + 1);
   }
  }
 }

 return depth;
 } }
