/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1]
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。
 * @author dell
 *
 */
public class ExArray_Num_2_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5};
		multiply(a);
	}
	/**
	 * 初步思想，循环进行实现，但是考虑到时间复杂度过高，再考虑一下其他的方式
	 * @param A
	 * @return
	 */
	  public static int[] multiply(int[] A) {
        int[] B=new int[A.length];
        ArrayList<Integer> list=new ArrayList<Integer>();
        int temp=1;
        for(int i=0;i<B.length;i++){
        	for(int j=0;j<A.length;j++){
        		if(j!=i){
        			temp =A[j]*temp;
        		}
        	}
        	B[i]=temp;
//        	System.out.println(temp);
        	temp=1;
        }
        
		  return B;
	    }
}
