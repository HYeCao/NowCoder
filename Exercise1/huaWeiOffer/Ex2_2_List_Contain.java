/**
 * 
 */
package huaWeiOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 输入一个字符串，求出该字符串包含的字符集合
 * @author dell
 *
 */
public class Ex2_2_List_Contain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		/*
		 * 循环输入测试用例的实现
		 */
		while(scanner.hasNext()){
		String str=scanner.nextLine();
		System.out.println(ClearStr(str));
		}
	}
	public static String ClearStr(String str){
		StringBuilder sb=new StringBuilder();
		List list=new ArrayList();//list用法的掌握（中午集合那块知识进行复习）
		for(int i=0;i<str.length();i++){
			if(!list.contains(str.charAt(i))){
				list.add(str.charAt(i));
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

}
