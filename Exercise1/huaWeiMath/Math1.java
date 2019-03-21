/**
 * 
 */
package huaWeiMath;

import java.util.Scanner;

/**
 * 2 IP address
 * @author dell
 *
 */
/*
 * 解题基本过程：1.审题清楚 ，解题思路想清楚 2.输入信息明确 
 *              3.数据结构定好 4.函数写清楚（一步一步写）5.输出信息处理 6.题目回看 
 */
public class Math1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
//		 long l = Long.valueOf("String");
		while(scanner.hasNextLine()){
			String input=scanner.nextLine();
			String[] str=input.split(" ");
			String ip1=str[0];
			String ip2=str[1];
			String code=str[2];
//			long ip1=Long.valueOf(str[0]);//255
//			long ip2=Long.valueOf(str[1]);//255
//			long code=Long.valueOf(str[2]);//192
//			String strs=Long.toBinaryString(ip1);//转化为二进制字符串1111
//			long num=Long.valueOf(strs);
//			System.out.println(Long.valueOf(num).toString());
			JudgeIP(ip1, ip2, code);
		}
	}
	public static String[] JudgeIP(String ip1,String ip2,String code){
		System.out.println(ip1);
		String str[]=ip1.split("\\.");//"."是转义字符要写成"\\."
		System.out.println(str.length);
		long ip_1=Long.valueOf(ip1);
		long ip_2=Long.valueOf(ip2);
		long codes=Long.valueOf(code);
		ip1=Long.toBinaryString(ip_1);
		ip2=Long.toBinaryString(ip_2);
		code=Long.toBinaryString(codes);
		int judge=0;
		System.out.println(ip1+" "+ip2+" "+code);
		StringBuilder code1=new StringBuilder();
		StringBuilder code2=new StringBuilder();
		for(int i=0;i<ip1.length();i++){
		if(ip1.charAt(i)=='1'&&code.charAt(i)=='1')
			code1.append('1');
		else {
			code1.append('0');
		}
		}
		for(int i=0;i<ip1.length();i++){
			if(ip2.charAt(i)=='1'&&code.charAt(i)=='1')
				code2.append('1');
			else {
				code2.append('0');
			}
			}
		if(code1.equals(code2))judge=1;
//		System.out.println(judge);
		return null;
	}
}
