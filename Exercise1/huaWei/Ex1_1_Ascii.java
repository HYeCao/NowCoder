/**
 * 
 */
package huaWei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ����һ���ַ�������ĸ�������֣����ܺ��ظ�ֵ����������ASCII��˳�����
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
			ascii[i]=(int)asc[i];//charֵת��Ϊascii
//			System.out.println(ascii[i]);
		}
		Arrays.sort(ascii);
		for(int i=0;i<ascii.length;i++){
			System.out.println((char)ascii[i]);//ascֵת��Ϊchar
		}
	}
}
