/**
 * 
 */
package faceOffer_rest;

import java.util.ArrayList;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 * @author dell
 *
 */
public class Ex8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	   public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	         ArrayList<Integer> arr=new ArrayList<Integer>();
//		     arr.add(array[0]);
		     for(int i=0;i<array.length;i++){
		    	 for(int j=0;j<array.length;j++){
		    		 if(array[i]==array[j]&&i!=j){
		    			 array[i]=-1;
		    			 array[j]=-1;
		    		 }
		    	 }
		     }
		     int j=1;
		     for(int i=0;i<array.length;i++){
		    	 System.out.println(array[i]);
		     }
		     for(int i=0;i<array.length;i++){
		    	 if(array[i]!=-1&&j==1){
		    		 num1[0]=array[i];
		    		 j=0;
		    	 }
		    	 if(array[i]!=-1&&j==0){
		    		 num2[0]=array[i];
		    	 }
		     }
	    }
}
