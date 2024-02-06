package pers.yiwen.linkedlist._0206;

import pers.yiwen.linkedlist.ListNode;
// Reverse Linked List
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        ListNode head = new ListNode(nums[0]);
        ListNode node = head;

        for (int i = 1; i < nums.length; i++) {
            node.next = new ListNode(nums[i]);
            node = node.next;
        }

        Solution solution = new Solution();
        node = solution.reverseList(head);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
