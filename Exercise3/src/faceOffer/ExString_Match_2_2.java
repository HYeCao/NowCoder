/**
 * 
 */
package faceOffer;

/**
 * ��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
 * ���磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ�� ����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ�
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
	 * ˼·�������ַ����ܹ���ʾ��������ʽ���г�����Ȼ������б�
	 * @param str
	 * @return
	 */
	 public boolean isNumeric(char[] str) {
		  String s=String.valueOf(str);
		   //��ţ�� ţ�� ţ��
	        return s.matches("[+-]?[0-9]*(\\.[0-9]*)?([eE][+-]?[0-9]+)?");   //�ַ���ƥ���ʵ��
	       
	    }
}
