/**
 * 
 */
package faceOffer;

import com.sun.java_cup.internal.runtime.Scanner;
/*
 * �������δ���
 */
/**
 * ��������1�ĸ���
 * ����һ��������������������Ʊ�ʾʽ��1�ĸ��������и����ò����ʾ
 * 1.������Ϊ������ 2.���������ʾ
 * @author dell
 *
 */
public class Ex3_2_2JinZhi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(NumberOf1(-8));
	}
		public static  int NumberOf1(int n) {
	        int t=0;
	            char[]ch=Integer.toBinaryString(n).toCharArray();
	            for(int i=0;i<ch.length;i++){
	                if(ch[i]=='1'){
	                    t++;
	                }
	            }
	            return t;
	    }

}
