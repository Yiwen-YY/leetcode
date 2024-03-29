package pers.yiwen.linkedlist._0203;

import pers.yiwen.linkedlist.ListNode;
// Remove Linked List Elements
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
       ListNode dummy = new ListNode();
       dummy.next = head;
       ListNode node = dummy;
       ListNode temp = node.next;

       while (temp != null) {
           if (temp.val == val) {
               node.next = temp.next;
           } else {
               node = node.next;
           }
           temp = node.next;
       }

       return dummy.next;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 7, 5};
        ListNode head = new ListNode(nums[0]);
        ListNode node = head;

        for (int i = 1; i < nums.length; i++) {
            node.next = new ListNode(nums[i]);
            node = node.next;
        }
        node = head;

        Solution solution = new Solution();
        solution.removeElements(head, 7);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
