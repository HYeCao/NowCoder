/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
 * @author dell
 *
 */
public class ExArray_Num_3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={2,3,4,2,6,2,5,1};
		maxInWindows(num, 0);
	}
	/**
	 * 
	 * @param num
	 * @param size
	 * @return
	 */
	 public static  ArrayList<Integer> maxInWindows(int [] num, int size){
	     
		 ArrayList<Integer> lists=new ArrayList<Integer>();  
		 ArrayList<Integer> list=new ArrayList<>();
		 if(size==0)return list;
		 int winNum=num.length-size+1;//��������
	       int i=0;
	       while(i<winNum){//���ݴ�����������ÿ�����ڵ��ж�
	    	   for(int j=i;j<size+i;j++){
	    		   list.add(num[j]);//��ʼ������ֵ����
	    	   }
	    	   Collections.sort(list);
	    	  lists.add(list.get(size-1));
	    	  list=new ArrayList<Integer>();
	    	  i++;
	       }
	       System.out.println(lists);
	       return lists;
	    }
}
