/**
 * 
 */
package huaWeiOffer;

import java.util.Scanner;

/**
 * �����ַ������һ�����ʵĳ��ȣ������Կո������
 * @author dell
 *
 */
public class Ex3_2_Split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext()){
			String str=scanner.nextLine();
			System.out.println(LastStr(str));
		}
	}
	public static int LastStr(String input){
		String[] str=input.split(" ");
		int i=str.length;
		return str[i-1].length();
//		return null;
	}
}
