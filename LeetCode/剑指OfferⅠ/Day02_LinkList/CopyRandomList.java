package Day02_LinkList;

import java.util.HashMap;
import java.util.Map;

//Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class CopyRandomList {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node curr = head;
        Map<Node,Node> hash = new HashMap<>();
        while (curr != null) {
        	hash.put(curr, new Node(curr.val));
        	curr = curr.next;
        }
        curr = head;
        while (curr != null) {
        	hash.get(curr).next = hash.get(curr.next);
        	hash.get(curr).random = hash.get(curr.random);
        	curr = curr.next;
        }
        return hash.get(head);
    }
}
