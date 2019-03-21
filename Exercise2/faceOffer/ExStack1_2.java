/**
 * 
 */
package faceOffer;

import java.util.Stack;

/**
 * @author dell
 *
 */
public class ExStack1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] push={1,2,3,4,5};
		int[] pop={4,3,5,2,1};
		System.out.println(IsPopOrder(push, pop));
		
	}
	/**
	 * ÅÐ±ð³öÕ»Ë³Ðò
	 * @param pushA
	 * @param popA
	 * @return
	 */
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		Stack<Integer> stack1=new Stack<Integer>();
		int j=0;
		for(int i=0;i<pushA.length;i++){
			if(pushA[i]==popA[j]){
				j++;
			}
			else {
				stack1.push(pushA[i]);
			}
		}
		for(j=j;j<popA.length;j++){
			if(stack1.peek()!=popA[j]){
				return false;
			}
			stack1.pop();
		}
	   return true;   
    }
}
