package faceOffer;

import java.util.ArrayList;

/**
 * ����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
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
