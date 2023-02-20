class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer> list = new LinkedList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        
        ListNode ans = head;
        int i = 0;
        while(ans != null){
            ans.val = arr[i];
            i++;
            ans = ans.next;
        }
        return head;
    }
}