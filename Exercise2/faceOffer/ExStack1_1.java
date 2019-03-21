/**
 * 
 */
package faceOffer;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））
 * 栈：先进后出，可以通过两个队列实现栈
 * @author dell
 *
 */
public class ExStack1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 借助一个辅助的stack min来存放最小值从而进行实现
	 * @author dell
	 *
	 */
	public class Solution {
	 
	    Stack<Integer> stack = new Stack<Integer>();
	    Stack<Integer> min=new Stack<Integer>();
	    public void push(int node) {
	    	if(min.isEmpty()){
	    		min.push(node);
	    	}
	    	else {
	    		if(min.peek()>=node)min.push(node);
	    	}
	        stack.push(node);
	    }
	 
	    public void pop() {
	    	if(stack.peek()==min.peek()){
	    		min.pop();
	    	}
	        stack.pop();
	    }
	 
	    public int top() {
	        return stack.peek();
	    }
	 
	    public int min() {
	    	return min.peek();
	     
	    }
	}

}
