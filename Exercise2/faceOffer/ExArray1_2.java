/**
 * 
 */
package faceOffer;

import java.util.ArrayList;
import java.util.Collections;


/**
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 * @author dell
 *
 */
public class ExArray1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={4,5,1,6,2,7,3,8};
		System.out.println(GetLeastNumbers_Solution(arr, 10));
		
	}

	public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
	
		ArrayList<Integer> list=new ArrayList<Integer>();
		/*
		 * 注意
		 */
		if(k>input.length)return list;
		if(k==0)return list;
		for(int i=0;i<input.length;i++){
			list.add(input[i]);
		}
		Collections.sort(list);
		ArrayList<Integer> end=new ArrayList<Integer>();
		int j=0;
		for(int i=0;i<input.length;i++){
			if(!end.contains(list.get(i))){
			end.add(list.get(i));
			j++;
			}
			if(j==k)break;
		}
//		System.out.println(end);
		return end;    
    }
	
}
