/**
 * 
 */
package faceOffer;

import java.util.Stack;

/**
 * ������ջʵ�ֶ��У���ɶ��е�Push��Pop����������Ԫ��Ϊint����
 * ջ���ص㣺�Ƚ����
 * ���У��Ƚ��ȳ�
 * ����ջ���ص��ڣ���ϤJava��ջ��ʹ�÷���
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
	 * push����
	 * ��ѹջ������ֱ�������stack1�м���
	 * @param x
	 */
	public static void push(int x){
		stack1.push(x);
	}
	/**
	 * pop����
	 * �����б�stack2���Ƿ�Ϊ�գ���Ϊ��ֱ��stack2.pop����
	 * Ϊ��ʱ����stack1�е���ȫ��pop��stack2�У�Ȼ��stack2.pop����
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
