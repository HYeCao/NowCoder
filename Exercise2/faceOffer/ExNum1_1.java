/**
 * 
 */
package faceOffer;

import java.util.ArrayList;


/**
 * ���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
 * @author dell
 *
 */
public class ExNum1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		System.out.println(NumberOf1Between1AndN_Solution(n));
	}
	public static int NumberOf1Between1AndN_Solution(int n) {
		ArrayList<String> lists=new ArrayList<String>();
		for(int i=1;i<=n;i++){
			lists.add(String.valueOf(i));
		}
		int num=0;
		for(int i=0;i<lists.size();i++){
			if(lists.get(i).contains("1")){
				num+=Count1(lists.get(i));				
			}
		}
	    return num;
    }
	public static int Count1(String str){
		int num=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='1')num++;
		}
		return num;
	}
}
