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
	 * java中如何将 string 转化成 long
     方法1：  long l = Long.valueOf("String");

     方法2： long l = Long.parseLong(“String”);     或    long l = Long.parseLong(“String”, int radix);
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
