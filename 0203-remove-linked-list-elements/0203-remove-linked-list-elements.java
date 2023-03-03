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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode();
        ListNode cur = ans;
        while(head != null){
            if(head.val != val){
                cur.next = new ListNode(head.val);
                head = head.next;
                cur = cur.next;
            }
            else head = head.next;
                
           
        }
        return ans.next;
    }
}