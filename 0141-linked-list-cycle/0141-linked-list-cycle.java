/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        int count = 0;
        while (true) {
            count = set.size();
            if(head.next == null){
                return false;
            }
            set.add(head);
            
            if(count == set.size()) return true;
            head = head.next;
        }
    }
}