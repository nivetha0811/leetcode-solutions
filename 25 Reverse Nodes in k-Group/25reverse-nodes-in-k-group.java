
class Solution {


    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k==1) return head;

        ListNode prev = null;
        ListNode curr = head;
        for(int i=0;i<k;i++){
            prev = curr;
            if(curr == null) return head;
            curr = curr.next;
        }
        prev.next = null;
        ListNode reversedHead = reverseKGroup(curr, k);
        ListNode revHead = reverse(head);
        ListNode tmp = revHead;
        while(tmp.next!=null){
            tmp = tmp.next;
        }
        tmp.next = reversedHead;
        return revHead;
    }

}