

class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        List<Integer> list = new LinkedList<>();
        ListNode temp = head;
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
       return makeListNode(arr);

    }
    public ListNode makeListNode(int[] arr){
        ListNode ans  = new ListNode();
        ans.val = arr[0];
        ListNode ansNext = ans;
        for(int i = 1; i < arr.length; i++){
            ansNext.next= new ListNode(arr[i]);
            ansNext = ansNext.next;
        }
        return ans;
    }
    }