/**
 * 
 */
package huaWeiOffer;

import java.util.Scanner;

/**
 * 计算字符串最后一个单词的长度，单词以空格隔开。
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
