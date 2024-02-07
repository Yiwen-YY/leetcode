package pers.yiwen.linkedlist._0019;

import pers.yiwen.linkedlist.ListNode;
// Remove Nth Node From End of List
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        }

        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
     }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2};
        ListNode head = new ListNode(nums[0]);
        ListNode node = head;

        for (int i = 1; i < nums.length; i++) {
            node.next = new ListNode(nums[i]);
            node = node.next;
        }

        Solution solution = new Solution();
        node = solution.removeNthFromEnd(head, 2);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
