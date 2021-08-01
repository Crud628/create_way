package LC206;

public class Fun1 {

    public ListNode reverseList(ListNode head) {
    	// 前驱节点
        ListNode prev = null;
        // 当前节点
        ListNode curr = head;
        // 遍历
        while (curr != null) {
        	// 后继节点
        	ListNode next = curr.next;
        	// 转向  由 '->' 变为 '<-'
        	curr.next = prev;
        	prev = curr;
        	curr = next;
        }
        return prev;
    }

}
