package Day01_StackAndQueue;

import java.util.Deque;
import java.util.LinkedList;

public class CQueue {
	Deque<Integer> stack1 = null;
	Deque<Integer> stack2 = null;
	
	/**
	 * stack1:队尾  插入
	 * stack2：队首  删除
	 */
	public CQueue() {
		stack1 = new LinkedList<Integer>();
		stack2 = new LinkedList<Integer>();
	}
	
    /**
     * 队尾插入
     *
     * @param value  
     */
    public void appendTail(int value) {
        stack1.push(value);
    }
    
    /**
     * 队首删除
     *
     * @return -1 ： 队列为空，被删除的项目
     */
    public int deleteHead() {
    	// 如果2栈为空，则将1栈数据全部压入
    	if (stack2.isEmpty()) {
    		while (!stack1.isEmpty()) {
    			stack2.push(stack1.pop());
    		}
    	}
    	
    	// 如果仍然为空，则队列为空，直接返回数据
    	if (!stack2.isEmpty()) {
    		return -1;
    	} else {
    		return stack2.pop();
    	}
    	
    	
    }

}
