/**
 * 
 */
package faceOffer;

/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 * @author dell
 *
 */
public class ExString_Match_2_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 思路：对于字符串能够表示的数的形式都列出来，然后进行判别
	 * @param str
	 * @return
	 */
	 public boolean isNumeric(char[] str) {
		  String s=String.valueOf(str);
		   //答案牛逼 牛逼 牛逼
	        return s.matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");   //字符串匹配的实现
	       
	    }
}
