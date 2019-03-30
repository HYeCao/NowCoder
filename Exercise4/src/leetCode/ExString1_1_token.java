/**
 * 
 */
package leetCode;

import java.util.ArrayList;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are+,-,*,/. Each operand may be an integer or another
 * expression. Some examples: ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * 
 * @author dell
 *
 */
public class ExString1_1_token {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] to={"0", "3", "/"};
		evalRPN(to);
	}
	/**
	 * 字符串分割计算加减乘除，后置运算符
	 * @param tokens
	 * @return
	 */
	public static int evalRPN(String[] tokens) {
		if(tokens==null)return 0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		int i=0;
		while(i<tokens.length){
			//将不是符号的数字加入至list之中
			if(!tokens[i].equals("+")&&!tokens[i].equals("-")&&!tokens[i].equals("*")&&!tokens[i].equals("/")){
				list.add(Integer.valueOf(tokens[i]));//当前数字加入其中
				i++;
			}
			else {//遇见符号，获取符号前两个数字进行计算，并且将前两个数字移除，结果加入
				if(tokens[i].equals("+")){
					int a=list.get(list.size()-1),b=list.get(list.size()-2);//获取前两个数字
					list.add(a+b);
//					System.out.println(list.size());
					list.remove(list.size()-2);
					list.remove(list.size()-2);
					
				}
				if(tokens[i].equals("-")){
					int a=list.get(list.size()-2),b=list.get(list.size()-1);//获取前两个数字
					list.add(a-b);
					list.remove(list.size()-2);
					list.remove(list.size()-2);
					
				}
				if(tokens[i].equals("*")){
					int a=list.get(list.size()-1),b=list.get(list.size()-2);//获取前两个数字
					list.add(a*b);
					list.remove(list.size()-2);
					list.remove(list.size()-2);
					
				}
				if(tokens[i].equals("/")){
					int a=list.get(list.size()-2),b=list.get(list.size()-1);//获取前两个数字
					if(a==0)list.add(0);
					list.add(a/b);
					list.remove(list.size()-2);
					list.remove(list.size()-2);
					
				}
				i++;
			}
		}
		System.out.println(list.get(0));
		return list.get(0);
	}
}
