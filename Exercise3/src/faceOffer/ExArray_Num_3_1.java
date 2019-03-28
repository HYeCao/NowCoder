/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
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
		 int winNum=num.length-size+1;//窗口数量
	       int i=0;
	       while(i<winNum){//根据窗口数量进行每个窗口的判断
	    	   for(int j=i;j<size+i;j++){
	    		   list.add(num[j]);//初始窗口数值加入
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
