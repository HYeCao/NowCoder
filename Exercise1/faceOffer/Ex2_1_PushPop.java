/**
 * 
 */
package faceOffer;

import java.util.Stack;

/**
 * 用两个栈实现队列，完成队列的Push合Pop操作，队列元素为int类型
 * 栈的特点：先进后出
 * 队列：先进先出
 * 两个栈来回倒腾，熟悉Java中栈的使用方法
 * @author dell
 *
 */
public class Ex2_1_PushPop {

	static Stack<Integer> stack1;
	static Stack<Integer> stack2;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 stack1=new Stack<Integer>();
		 stack2=new Stack<Integer>();
		push(2);
		push(3);
		push(4);
		System.out.println(pop());
		push(5);
		push(6);
		System.out.println(pop());

	}
	/**
	 * push操作
	 * 将压栈的数字直接添加至stack1中即可
	 * @param x
	 */
	public static void push(int x){
		stack1.push(x);
	}
	/**
	 * pop操作
	 * 首先判别stack2中是否为空，不为空直接stack2.pop即可
	 * 为空时，将stack1中的数全部pop到stack2中，然后stack2.pop即可
	 * @return
	 */
	public static int pop(){
		if(!stack2.isEmpty()){
			return stack2.pop();
		}
		else {
			while(!stack1.isEmpty()){
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}
