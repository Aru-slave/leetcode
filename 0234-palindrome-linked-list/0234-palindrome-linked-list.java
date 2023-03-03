class Solution { 
    public ListNode reverseList(ListNode head) {

       ListNode cur=head;
       ListNode prev=null;

      while(cur!=null){
          ListNode temp=cur.next;
          cur.next=prev;
          
          prev=cur;
          cur=temp;
         
      }
return prev;

        
    }
    
    public boolean isPalindrome(ListNode head) {
      
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        if(fast!=null){
            slow=slow.next;
        }
        
        slow=reverseList(slow);
        fast=head;
        
        while(slow!=null){
            if(slow.val!=fast.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
        
        
        
    }
}