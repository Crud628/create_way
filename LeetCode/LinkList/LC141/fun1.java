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

    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
