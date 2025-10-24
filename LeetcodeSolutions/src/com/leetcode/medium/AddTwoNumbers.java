package com.leetcode.medium;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class AddTwoNumbers {
	// 1 ms
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		return l2;
//        ListNode dummy = new ListNode();
//        ListNode res = dummy;
//        int total = 0, carry = 0;
//
//        while (l1 != null || l2 != null || carry != 0) {
//            total = carry;
//
//            if (l1 != null) {
//                total += l1.val;
//                l1 = l1.next;
//            }
//            if (l2 != null) {
//                total += l2.val;
//                l2 = l2.next;
//            }
//
//            int num = total % 10;
//            carry = total / 10;
//            dummy.next = new ListNode(num);
//            dummy = dummy.next;
//        }
//
//        return res.next;        
    }
}
