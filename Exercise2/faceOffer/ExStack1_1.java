/**
 * 
 */
package faceOffer;

import java.util.Stack;

/**
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1����
 * ջ���Ƚ����������ͨ����������ʵ��ջ
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
	 * ����һ��������stack min�������Сֵ�Ӷ�����ʵ��
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
