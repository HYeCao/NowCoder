/**
 * 
 */
package faceOffer;

/**
 * ����һ���������ַ�����S���������ѭ������Kλ����������
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
	     if(str.equals(""))return "";//��������������������
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
