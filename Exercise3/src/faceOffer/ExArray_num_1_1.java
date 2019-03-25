/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author dell
 *
 */
public class ExArray_num_1_1 {

	/**
	 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1=new int[1];
		int[] num2=new int[1];
		int[] num={1,2,3,1,2,4};
		FindNumsAppearOnce(num, num1, num2);
	}
	/*
	 * //num1,num2分别为长度为1的数组。传出参数
	 * //将num1[0],num2[0]设置为返回结果
	 */
	 public static  void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	        ArrayList<Integer> arr=new ArrayList<Integer>();
	        for(int i=0;i<array.length;i++){
//	        	System.out.println(array[i]);
	        	if(arr.contains(array[i])){
	        		System.out.println(array[i]);
	        		
	        	}
	        	else{
//	        		System.out.println(array[i]);s
	        		arr.add(array[i]);
	        	}
	        }
	        num1[0]=arr.get(0);
	        num2[0]=arr.get(2);
//	        System.out.println(num1[0]);
//	        System.out.println(num2[0]);
	    }
}
