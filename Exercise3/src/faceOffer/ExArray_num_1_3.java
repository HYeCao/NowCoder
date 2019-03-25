package faceOffer;

import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * @author dell
 *
 */
public class ExArray_num_1_3 {
   
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		FindNumbersWithSum(arr, 6);
	}
	/*
	 * 
	 */
	 public static  ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 for(int i=0;i<array.length;i++){
			 for(int j=array.length-1;j>i;j--){
				 if(array[i]+array[j]==sum){
					 list.add(array[i]);
					 list.add(array[j]);
					 i=array.length;
					 break;
				 }
			 }
		 }
		 System.out.println(list);
		 return list;     
	    }
}
