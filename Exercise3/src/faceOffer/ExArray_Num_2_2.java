/**
 * 
 */
package faceOffer;

import java.util.ArrayList;

/**
 * ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1]
 * ����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]��
 * ����ʹ�ó�����
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
	 * ����˼�룬ѭ������ʵ�֣����ǿ��ǵ�ʱ�临�Ӷȹ��ߣ��ٿ���һ�������ķ�ʽ
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
