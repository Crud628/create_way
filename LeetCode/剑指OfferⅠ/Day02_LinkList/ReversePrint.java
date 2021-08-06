package Day02_LinkList;

import java.util.Stack;

//Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

/**
 * 存入栈中，再顺序取出
 * @author lan
 * 2021年8月6日
 * TODO
 */
public class ReversePrint {
	public int[] reversePrint(ListNode head) {

		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode temp = head;
		while (temp != null) {
			stack.push(temp);
			temp = temp.next;
		}
		int size = stack.size();
		int[] print = new int[size];
		for (int i = 0; i < size; i++) {
			print[i] = stack.pop().val;
		}
		return print;
	}
}
