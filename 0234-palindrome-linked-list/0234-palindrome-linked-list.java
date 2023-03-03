/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        while(head != null){
            list.add(head.val);
            stack.add(head.val);
            head = head.next;
        }
        while(!stack.isEmpty()){
            if(stack.pop() != list.get(index)) return false;
            index++;
        }
        return true;
    }
}