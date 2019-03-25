/**
 * 
 */
package faceOffer;

/**
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出
 * @author dell
 *
 */
public class ExString1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 
	 * @param str
	 * @param n
	 * @return
	 */
	 public String LeftRotateString(String str,int n) {
	     if(str.equals(""))return "";//首先需求对特殊情况考虑
		 StringBuilder sb=new StringBuilder();
	     StringBuilder sb2=new StringBuilder();
	     for(int i=0;i<n;i++){
	    	 sb2.append(str.charAt(i));
	    	 
	     }
	     for(int i=n;i<str.length();i++){
	    	 sb.append(str.charAt(i));
	     }
	     sb.append(sb2.toString());
		 return sb.toString();
	    }
}
