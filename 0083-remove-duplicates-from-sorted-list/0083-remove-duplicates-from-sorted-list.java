class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        //if the list is empty, return null.
        if(head == null) return head;
        
        //initialize t from head.
        ListNode t = head;

        //while the next node is not null.
        while(t.next != null)
        {
            //if current node value == next node value.
            if(t.val == t.next.val)
            {
                t.next = t.next.next;
            }
            else
            {
                //update t only if the node values are different.
                t = t.next;
            }
        }

        return head;
        
    }
}