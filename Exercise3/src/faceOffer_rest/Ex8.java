/**
 * 
 */
package faceOffer_rest;

import java.util.ArrayList;

/**
 * һ�����������������������֮�⣬���������ֶ����������Ρ�
 * ��д�����ҳ�������ֻ����һ�ε����֡�
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
