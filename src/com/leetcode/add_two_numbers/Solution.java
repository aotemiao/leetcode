package com.leetcode.add_two_numbers;

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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, add = 0;
        ListNode p, q;
        p = l1;
        q = l2;
        ListNode result = new ListNode();
        ListNode head = result;
        while (p != null && q != null) {
            add = p.val + q.val + carry;
            if (add / 10 == 1) {
                add = add % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            head.next = new ListNode(add, null);
            head = head.next;
            p = p.next;
            q = q.next;
        }
        //处理多余位数
        while (p != null) {
            add = p.val + carry;
            if (add / 10 == 1) {
                add = add % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            head.next = new ListNode(add, null);
            head = head.next;
            p = p.next;
        }
        while (q != null) {
            add = q.val + carry;
            if (add / 10 == 1) {
                add = add % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            head.next = new ListNode(add, null);
            head = head.next;
            q = q.next;
        }
        //进位
        if (carry == 1) {
            head.next = new ListNode(1, null);
        }
        return result.next;
    }
}