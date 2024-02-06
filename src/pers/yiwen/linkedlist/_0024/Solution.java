package pers.yiwen.linkedlist._0024;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode node = head.next;
        ListNode prev = head;
        ListNode temp = null;

        while (prev != null && prev.next != null) {
            ListNode cur = prev.next;

            ListNode next = cur.next;
            cur.next = prev;
            prev.next = next;

            if (temp != null) {
                temp.next = cur;
            }
            temp = prev;

            prev = next;
        }

        return node;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        ListNode head = new ListNode(nums[0]);
        ListNode node = head;

        for (int i = 1; i < nums.length; i++) {
            node.next = new ListNode(nums[i]);
            node = node.next;
        }

        Solution solution = new Solution();
        node = solution.swapPairs(head);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
