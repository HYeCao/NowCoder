/**
 * 
 */
package faceOffer;

import java.util.ArrayList;


/**
 * 你能不能也很快的找出所有和为S的连续正数序列? 
 * @author dell
 *
 */
public class ExArray_Num_1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindContinuousSequence(9);
	}
	/**
	 * 
	 * @param sum
	 * @return
	 */
	 public static  ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	    ArrayList<Integer> list=new ArrayList<Integer>();
	    ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
	    int num=0;
	    System.out.println(sum/2+1);
	    for(int i=1;i<(sum/2+1);i++){
	    	num=i;
	    	list.add(i);
	    	for(int j=i+1;j<=sum/2+1;j++){
	    		if(num<sum){
//	    			System.out.println(j);
	    			list.add(j);
	    			num +=j;
	    		}
	    		if(num==sum){
//	    			System.out.println(i);
	    			ArrayList<Integer> arr=new ArrayList<>(list);
	    			System.out.println(arr);
 	    			lists.add(arr);
	    			list.clear();
	    			j=num;
	    		}
	    		if(num>sum){
	    			list.clear();
	    			j=num;
	    		}
	    		
	    	}
	    }
	    System.out.println(lists);
		 return lists;
	    }
}
