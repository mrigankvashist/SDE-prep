
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class reverselinkedlist2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;  // till left so that next is current node
        }
        ListNode curr = pre.next;
        ListNode fwd = curr.next;
        for (int i = 0; i < right - left; i++) {  // write on paper to evaluate new links
            curr.next = fwd.next;
            fwd.next = pre.next;
            pre.next = fwd;
            fwd = curr.next;
        }
        return dummy.next;

    }
}