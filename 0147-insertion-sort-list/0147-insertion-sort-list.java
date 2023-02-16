import java.util.*;

class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        List<Integer> list = new LinkedList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int [] arr = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        temp = head;
        int i = 0;
        while(temp != null){
            temp.val = arr[i];
            temp = temp.next;
            i++;
        }
        return head;

    }
}
