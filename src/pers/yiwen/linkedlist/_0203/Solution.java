package pers.yiwen.linkedlist._0203;
// Remove Linked List Elements
public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {

        }
        ListNode(int val) {

            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
       ListNode dummy = new ListNode();
       dummy.next = head;
       ListNode node = dummy;
       ListNode temp = node.next;
       while (temp != null) {
           if (temp.val == val) {
               node.next = temp.next;
           }
               node = node.next;

           if (node != null) {
               temp = node.next;
           } else {
               temp = null;
           }

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
        head = solution.removeElements(head, 7);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
