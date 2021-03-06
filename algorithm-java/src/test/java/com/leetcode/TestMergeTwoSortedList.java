package com.leetcode;

import com.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestMergeTwoSortedList {

	@Test
	public void testBruteForce() {
		ListNode first = new ListNode(1);
		first.setNext(2).setNext(4);
		ListNode second = new ListNode(1);
		second.setNext(3).setNext(5);

		ListNode result = MergeTwoSortedList.mergeBruteForce(first, second);
		System.out.println(result);
	}

	@Test
	public void testPriorityQueue() {
		ListNode first = new ListNode(1);
		first.setNext(2).setNext(4);
		ListNode second = new ListNode(1);
		second.setNext(3).setNext(5).setNext(7);

		ListNode result = MergeTwoSortedList.mergeByPriorityQueue(first, second);
		System.out.println(result);
	}
}
