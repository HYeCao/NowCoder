/**
 * 
 */
package huaWeiOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ����һ���ַ�����������ַ����������ַ�����
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
		 * ѭ���������������ʵ��
		 */
		while(scanner.hasNext()){
		String str=scanner.nextLine();
		System.out.println(ClearStr(str));
		}
	}
	public static String ClearStr(String str){
		StringBuilder sb=new StringBuilder();
		List list=new ArrayList();//list�÷������գ����缯���ǿ�֪ʶ���и�ϰ��
		for(int i=0;i<str.length();i++){
			if(!list.contains(str.charAt(i))){
				list.add(str.charAt(i));
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

}
