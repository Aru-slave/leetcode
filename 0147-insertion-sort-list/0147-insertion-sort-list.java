import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        List<Integer> list = new LinkedList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        temp = head;
        int i = 0;
        while(temp != null){
            temp.val = list.get(i);
            temp = temp.next;
            i++;
        }
        return head;

    }
}
