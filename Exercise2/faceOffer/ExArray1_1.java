/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 * @author dell
 *
 */
public class ExArray1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,1,2,2};
		System.out.println(MoreThanHalfNum_Solution(arr));
	}
	/**
	 * 
	 * @param array
	 * @return
	 */
	  public static int MoreThanHalfNum_Solution(int [] array) {
		  ArrayList<Integer> list=new ArrayList<Integer>();
		  for(int i=0;i<array.length;i++){
			  list.add(array[i]);
		  }
		  Collections.sort(list);
		  int x1,c1=1,x2=0,c2=0;
		  x1=list.get(0);
		  for(int i=1;i<array.length;i++){
			if(list.get(i)==x1){
				c1++;
			}
			if(list.get(i)!=x1&&x2==0){
				x2=list.get(i);

			}
			if(list.get(i)==x2){
				c2++;
			}
			if(c2>c1){
				x1=x2;
				x2=0;
				c1=c2;
				c2=0;
			}
		  }
//		  System.out.println(x1+" "+c1);
		  if(c1<=array.length/2)return 0;
		  return x1;     
	 }
}
