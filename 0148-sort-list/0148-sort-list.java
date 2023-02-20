class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        Collections.sort(list);
        
        ListNode ans = head;
        int i = 0;
        while(ans != null){
            ans.val = list.get(i);
            i++;
            ans = ans.next;
        }
        return head;
    }
}