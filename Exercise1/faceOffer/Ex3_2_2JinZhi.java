/**
 * 
 */
package faceOffer;

import com.sun.java_cup.internal.runtime.Scanner;
/*
 * 负数情况未解决
 */
/**
 * 二进制中1的个数
 * 输入一个整数，输出该数二进制表示式中1的个数，其中负数用补码表示
 * 1.整数化为二进制 2.负数补码表示
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
