package Day02_LinkList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseList {
	
    public ListNode reverseList(ListNode head) {
    	ListNode prev = null;
    	ListNode curr = head;
    	while (curr != null) {
    		ListNode next = head.next;
    		curr.next = prev;
    		prev = curr;
    		curr = next;
    	}
    	return prev;
    	
    }
}
