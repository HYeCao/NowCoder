/**
 * 
 */
package huaWeiOffer;

import java.util.Scanner;

/**
 * @author dell
 *
 */
public class Ex5_1_intFanxu_Long {

	/**
	 * @param args
	 */
	/*
	 * java����ν� string ת���� long
     ����1��  long l = Long.valueOf("String");

     ����2�� long l = Long.parseLong(��String��);     ��    long l = Long.parseLong(��String��, int radix);
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNextInt()){
			int num=scanner.nextInt();
			String str=String.valueOf(num);
			for(int i=0;i<str.length();i++){
				System.out.print(str.charAt(i)+" ");
			}
		}
	}

}
