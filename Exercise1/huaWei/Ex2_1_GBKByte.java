/**
 * 
 */
package huaWei;

import java.io.UnsupportedEncodingException;

/**
 * ��GBK�����£����дһ����ȡ�ַ����ĺ����� ����Ϊһ���ַ������ֽ��������Ϊ���ֽڽ�ȡ���ַ����� 
 * ����Ҫ��֤���ֲ����ذ����ͬʱ�����ַ����е����ֺ�������ս����
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
		String str="��Ϊabc123";
		StringBuilder strs = new StringBuilder();
		/*
		 * ���ֵ�����
		 */
		for(int i=0;i<str.length();i++){
			if((int)str.charAt(i)<48||(int)str.charAt(i) > 57){
				strs.append(str.charAt(i));//ͨ��stringbuilderʵ��ÿ���ַ������
			}
		}
		str=strs.toString();
		int num=3;
		byte[] b=str.getBytes("GBK");//��ȡ�ֽ��� һ�����������ֽڣ� ����Ϊһ���ֽ�
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
