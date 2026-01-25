class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        ListNode result = lists[0];
        for (int i = 1; i < lists.length; i++) {
            result = merge(result, lists[i]);
        }
        return result;
    }


    // merge two sorted lists into one sorted list with Two Pointers (Same Direction)
    private ListNode merge(ListNode list1, ListNode list2) {
        // corner case
        if (list2 == null) return list1;
        else if (list1 == null) return list2;

        ListNode merged;
        if (list1.val <= list2.val) {
            merged = list1;
            list1 = list1.next;
            
        }
        else {
            merged = list2;
            list2 = list2.next;
        }

        ListNode curr = merged; // tracking merged
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
                
            }
            else {
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
            }
        }

        // post processing
        if (list1 != null) curr.next = list1;
        else curr.next = list2; // list2 != null

        return merged;
    }
}