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
	 * һ�����������������������֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε�����
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
	 * //num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
	 * //��num1[0],num2[0]����Ϊ���ؽ��
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
