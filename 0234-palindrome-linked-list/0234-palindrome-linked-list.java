class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        for(int i = list.size() - 1, j = 0; i >=list.size()/2; i--,j++){
            if(list.get(i) != list.get(j)) return false;
             
        }
        return true;
    }
}