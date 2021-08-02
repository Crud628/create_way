package LC141;

import java.util.HashSet;
import java.util.Set;

/**
 * 方法一：哈希表
 * 思路及算法
 * 
 * 最容易想到的方法是遍历所有节点，每次遍历到一个节点时，判断该节点此前是否被访问过。
 * 具体地，我们可以使用哈希表来存储所有已经访问过的节点。每次我们到达一个节点，如果
 * 该节点已经存在于哈希表中，则说明该链表是环形链表，否则就将该节点加入哈希表中。
 * 重复这一过程，直到我们遍历完整个链表即可。
 * @author lan
 * 2021年8月1日
 * TODO
 */
public class fun1 {

	/**
	 * 时间复杂度O（n）遍历一次
	 * 空间复杂度O（n）存储节点
	 * 
	 * @param head 当前列表
	 * @return 是否有环
	 */
    public boolean hasCycle(ListNode head) {
    	// 存储访问过的节点
        Set<ListNode> seen = new HashSet<ListNode>();
        // 遍历链表
        while (head != null) {
        	// 有环则返回true
            if (!seen.add(head)) {
                return true;
            }
            // 遍历结束则退出 指向NULL
            head = head.next;
        }
        // 没有环
        return false;
    }
}
