/**
 * 
 */
package huaWei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入一行字符串（字母或者数字，可能含重复值），按照其ASCII码顺序输出
 * @author dell
 *
 */
public class Ex1_1_Ascii {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Ascii(input);
	}
	
	public static void Ascii(String str){
		char[] asc=str.toCharArray();
		int[] ascii=new int[asc.length];
		for(int i=0;i<asc.length;i++){
			ascii[i]=(int)asc[i];//char值转换为ascii
//			System.out.println(ascii[i]);
		}
		Arrays.sort(ascii);
		for(int i=0;i<ascii.length;i++){
			System.out.println((char)ascii[i]);//asc值转换为char
		}
	}
}
