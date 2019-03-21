/**
 * 
 */
package huaWei;

import java.io.UnsupportedEncodingException;

/**
 * 在GBK编码下，请编写一个截取字符串的函数， 输入为一个字符串和字节数，输出为按字节截取的字符串。 
 * 但是要保证汉字不被截半个，同时忽略字符串中的数字后输出最终结果。
 * @author dell
 *
 */
public class Ex2_1_GBKByte {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String str="华为abc123";
		StringBuilder strs = new StringBuilder();
		/*
		 * 数字的消除
		 */
		for(int i=0;i<str.length();i++){
			if((int)str.charAt(i)<48||(int)str.charAt(i) > 57){
				strs.append(str.charAt(i));//通过stringbuilder实现每个字符的添加
			}
		}
		str=strs.toString();
		int num=3;
		byte[] b=str.getBytes("GBK");//获取字节数 一个汉字两个字节， 其余为一个字节
		System.out.println(DivideStr(str,num));
	}
	public static String DivideStr(String str,int num) throws UnsupportedEncodingException{

		byte[] b=str.getBytes();

		int count=num;
		for(int i=0;i<num;i++){
			if(b[i]<0){
				count++;
				i++;
			}
		}
		return new String(b,0,count,"GBK");
	}
}
