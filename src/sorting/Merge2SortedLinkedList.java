package sorting;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

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

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;

        ListNode ptr = null;
        ListNode head = null;

        while (ptr1 != null || ptr2 != null) {
            ListNode newNode = new ListNode();

            if (head == null) {
                ptr = newNode;
                head = ptr;
            } else {
                ptr.next = newNode;
                ptr = ptr.next;
            }

            if (ptr2 == null) {
                ptr.val = ptr1.val;
                ptr1 = ptr1.next;
            } else if (ptr1 == null) {
                ptr.val = ptr2.val;
                ptr2 = ptr2.next;
            } else if ((ptr1.val <= ptr2.val)) {
                ptr.val = ptr1.val;
                ptr1 = ptr1.next;
            } else {
                ptr.val = ptr2.val;
                ptr2 = ptr2.next;
            }
        }

        return head;
    }
}