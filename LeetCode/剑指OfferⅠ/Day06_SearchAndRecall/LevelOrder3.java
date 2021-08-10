package Day06_SearchAndRecall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 * 
 * @author lan
 * 2021年8月10日
 * TODO
 */
public class LevelOrder3 {
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        Queue<TreeNode> queue = new LinkedList<>();
	        List<List<Integer>> res = new ArrayList<>();
	        if(root != null) queue.add(root);
	        while(!queue.isEmpty()) {
	            List<Integer> tmp = new ArrayList<>();
	            for(int i = queue.size(); i > 0; i--) {
	                TreeNode node = queue.poll();
	                tmp.add(node.val);
	                if(node.left != null) queue.add(node.left);
	                if(node.right != null) queue.add(node.right);
	            }
	            if(res.size() % 2 == 1) Collections.reverse(tmp);
	            res.add(tmp);
	        }
	        return res;
	    }
}
