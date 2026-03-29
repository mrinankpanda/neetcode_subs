class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode list1curr = list1;
        ListNode list2curr = list2;

        while (list1curr != null && list2curr != null) {
            if (list1curr.val <= list2curr.val) {
                current.next = list1curr;
                list1curr = list1curr.next;
            } else {
                current.next = list2curr;
                list2curr = list2curr.next;
            }
            current = current.next;
        }

        if (list1curr != null) {
            current.next = list1curr;
        }

        if (list2curr != null) {
            current.next = list2curr;
        }

        return dummy.next;
    }
}