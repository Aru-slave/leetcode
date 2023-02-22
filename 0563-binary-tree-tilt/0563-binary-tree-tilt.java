class Solution {
    int sum =0;
    public int findTilt(TreeNode root) {
        if(root == null) return 0;
     return Math.abs( findSum(root.left)- findSum(root.right))+ findTilt(root.left)+findTilt(root.right);
    }
    
   int findSum(TreeNode root){
       if(root==null) return 0;
       return findSum(root.left )+findSum(root.right)+root.val;
   }
  
}