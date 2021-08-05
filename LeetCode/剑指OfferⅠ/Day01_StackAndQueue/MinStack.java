package Day01_StackAndQueue;

import java.util.Stack;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
public class MinStack {
	
	private Stack<Integer> stackDate;
	private Stack<Integer> stackMin;
	
	
	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(0);
		minStack.push(1);
		minStack.push(0);
		System.out.println(minStack.min());
		minStack.pop();
		System.out.println(minStack.min());
	}
	
    /** initialize your data structure here. */
    public MinStack() {
    	stackDate = new Stack<>();
    	stackMin = new Stack<>();
    }
    
    /**
     * 压栈
     * 
     * @param x 传入值
     */
    public void push(int x) {
    	stackDate.add(x);
        if (stackMin.empty() || stackMin.peek() >= x) {
            stackMin.add(x);
        }
    }
    
    /**
     * 弹栈
     */
    public void pop() {
        if (stackDate.empty()) {
            return;
        }
        if (stackDate.pop().equals(stackMin.peek())) {
            stackMin.pop();
        }
    }
    
    public int top() {
    	return stackDate.peek();
    }
    
    public int min() {
    	return stackMin.peek();
    }
}
